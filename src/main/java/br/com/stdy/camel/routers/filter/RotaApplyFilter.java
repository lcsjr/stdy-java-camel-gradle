package br.com.stdy.camel.routers.filter;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class RotaApplyFilter {

	public static void main(String[] args) throws Exception {

		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {

				from("file:pedidos?delay=5s&noop=true")
					.log("${exchange.pattern}")
					.log("${id}")
					.split()
						.xpath("pedido/itens/item")
					.filter()
						.xpath("item/formato[text()='EBOOK']")
					.log("filtrando tag formato igual a EBOOK...")
					.log("${body}")
					.marshal().xmljson()
					.log("Convertendo xml para json...")
					.log("${body}")
					.setHeader(Exchange.FILE_NAME, simple("${file:name.noext}-${header.CamelSplitIndex}.json"))
				.to("file:saida")
				;
			}
		});
		
		context.start();
		Thread.sleep(5000);
		context.stop();
	}	
}
