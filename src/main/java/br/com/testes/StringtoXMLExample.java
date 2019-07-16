package br.com.testes;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class StringtoXMLExample {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	
		File xmlFile = new File("employees.xml");
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		System.out.println("Root element :" + doc.getDocumentElement().getChildNodes());
		System.out.println(doc);
	
	}
}
