package br.com.spring.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.xstream.XStreamDataFormat;
import org.springframework.stereotype.Component;

import com.thoughtworks.xstream.XStream;

import br.com.spring.model.Person;

@Component
public class RouteXmlToJava extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		final XStream xstream = new XStream();
//		xstream.processAnnotations(Person.class);
		xstream.alias("person", Person.class);

//        from("timer:new-order?delay=1s&period=2s")
//        .routeId("generate-order")
//        .bean("orderService", "generateOrder")
//        .to("jpa:io.fabric8.quickstarts.camel.Order")
//        .log("Inserted new order ${body.id}");

		from("file:xml?delay=5s&noop=true").routeId("route-XmlToJava")
//			.convertBodyTo(String.class)
			.log("${body}")
			.unmarshal(new XStreamDataFormat(xstream))
			.log("${body}")
			
			
			
//			.unmarshal(new XStreamDataFormat(xstream))
			.log("${body}")
//			.convertBodyTo(Person.class)
//			.log("${body}")
			.toF("jpa:%s", Person.class.getName())
			.log("Inserted new order ${body.id}");

	}

}
