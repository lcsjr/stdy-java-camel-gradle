package br.com.stdy.camel.routers.servico;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.xstream.XStreamDataFormat;
import org.apache.camel.impl.DefaultCamelContext;

import com.thoughtworks.xstream.XStream;

import br.com.stdy.camel.model.Negociacao;

public class RotaHttpXmlToJava {

	
	
	public static void main(String[] args) throws Exception {
	
		final XStream xstream = new XStream();
		xstream.alias("negociacao", Negociacao.class);
		
		CamelContext context = new DefaultCamelContext();
		context.addRoutes( new RouteBuilder() {

			@Override
			public void configure() throws Exception {

				from("timer://negociacoes?fixedRate=true&delay=1s&period=360s")
					.to("http4://argentumws-spring.herokuapp.com/negociacoes")
						.convertBodyTo(String.class)
						.unmarshal(new XStreamDataFormat(xstream))
						.split(body()) //cada negociação se torna uma mensagem
						.log("${body}")
//						.setHeader(Exchange.FILE_NAME, constant("negociacoes.xml"))
//						.to("file:saida")
						.end();
				;
			}
			
		});
		context.start();
		Thread.sleep(5000);
		context.stop();
	}
}
