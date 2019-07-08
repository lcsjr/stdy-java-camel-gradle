package br.com.testes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

import com.thoughtworks.xstream.XStream;

import br.com.spring.model.Person;

public class SerializandoDeserializandoXML {

	public static void main(String[] args) throws IOException {
		XStream xstream = new XStream();

		//serializando
		xstream.alias("person", Person.class);
		Person person = new Person(3,"luiz","sant",35);
				System.out.println(person);
		String xml = xstream.toXML(person ) ;
		FileWriter fw = new FileWriter("person_1.xml");
	    fw.write(xml);
	    fw.close();
	
		System.out.println( xml );

		//Deserializando
		Person p = (Person) xstream.fromXML(xml);
		System.out.println( p );		// TODO Auto-generated method stub

	}

}
