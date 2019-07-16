package br.com.spring.camel.routes;

import java.net.URL;

import javax.xml.namespace.QName;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.soap.name.ServiceInterfaceStrategy;
import org.apache.camel.model.dataformat.SoapJaxbDataFormat;
import org.springframework.stereotype.Component;

import br.com.spring.model.Curso;
import br.com.stdy_soap.courses.CoursePort;
import br.com.stdy_soap.courses.CoursePortService;
import br.com.stdy_soap.courses.GetCourseDetailsRequest;
import br.com.stdy_soap.courses.GetCourseDetailsResponse;

@Component
public class RouteSendToWSSoap extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("file:consulta.curso?delay=5s&noop=true")
		.routeId("route-SendToWSSoap")
			.setHeader("ID_CURSO", xpath("//*[local-name()='id']/text()"))
			.log("Pesquisando curso ID ${header.id_curso}")
			.log("${body}")
			.to("file:saida")
			.process(exchange->{
				String xml = exchange.getIn().getBody(String.class);
				System.out.println(xml);

				System.out.println("Iniciando conexão SOAP...");
				final QName SERVICE_NAME = new QName("http://stdy-soap.com.br/courses", "CoursePortService");
		        URL wsdlURL = CoursePortService.WSDL_LOCATION;

		        CoursePortService ss = new CoursePortService(wsdlURL, SERVICE_NAME);
			    CoursePort port = ss.getCoursePortSoap11();
		        
		        GetCourseDetailsRequest request = new GetCourseDetailsRequest();
		        
		        request.setId( exchange.getIn().getHeader("ID_CURSO",Integer.class) );
		        GetCourseDetailsResponse response = port.getCourseDetails(request);

		        Curso curso = new Curso();
		        curso.setId(response.getCourseDetails().getId());
		        curso.setNome(response.getCourseDetails().getName());
		        curso.setDescricao(response.getCourseDetails().getDescription());
		        
		        System.out.println("getCourseDetails.result=" + response.getCourseDetails().toString());
		        
		        exchange.getOut().setBody(curso, Curso.class);
				
			})
			.toF("jpa:%s", Curso.class.getName())
			.log("Inserted new row ${body.id}");
		
	}

}
