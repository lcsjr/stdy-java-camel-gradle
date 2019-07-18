package br.com.spring.camel.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

@Component
public class RouteHTTP4 extends RouteBuilder{

	@Override
	public void configure() throws Exception {

		from("file:consulta.curso?delay=5s&noop=true")
			.routeId("route-HTTP4")
			.doTry()
				.log("Request: ${body}")
				.to("http4://localhost:8080/ws")
				.convertBodyTo(Document.class)
				.log("Response: ${body}")
				.setHeader("ID_CURSO", xpath("//*[local-name() = 'id']", String.class))
				.setHeader("NOME_CURSO", xpath("//*[local-name() = 'name']", String.class))
				.setHeader("DESC_CURSO", xpath("//*[local-name() = 'description']", String.class))
				.log("Informações do Curso: ${header.id_curso} - ${header.nome_curso} - ${header.desc_curso}")
			.doCatch(Exception.class)
	            .setBody(exceptionMessage())
	            .log(LoggingLevel.ERROR, "Message: ${exception.message}")
	            .log(LoggingLevel.ERROR, "Cause: ${exception.cause}")
	        .endDoTry()
	    .end()
		;
		
		
	}

	
}
