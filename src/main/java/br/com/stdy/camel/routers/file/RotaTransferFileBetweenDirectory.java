package br.com.stdy.camel.routers.file;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class RotaTransferFileBetweenDirectory {

	public static void main(String[] args) throws Exception {

		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {

				from("file:pedidos?delay=5s&noop=true")
					.log("${exchange.pattern}")
					.log("${id} - ${body}")
				.to("file:saida")
				;
			}
		});
		
		context.start();
		Thread.sleep(5000);
		context.stop();
	}
}
