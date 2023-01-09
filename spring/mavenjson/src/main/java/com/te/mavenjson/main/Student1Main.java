package com.te.mavenjson.main;
//converting from javaobject to xml file
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.te.mavenjson.bean.Student1;

public class Student1Main {

	public static void main(String[] args) throws JAXBException {
		Student1 student1=new Student1();
		student1.setSid(100);
		student1.setSname("sonu");
		student1.setMarks(98.23);
		student1.setPassword("12345678");
		
		System.out.println(student1);
		
		System.out.println("===================================");
		
		try {
			JAXBContext context=JAXBContext.newInstance(Student1.class);
			Marshaller marshaller=context.createMarshaller();
			//marshaller.marshal(student1, System.out);
			marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT,true);//in order to get line by line we use jaxb-formatted-output
			marshaller.marshal(student1, System.out);
			marshaller.marshal(student1, new File("student1.xml"));
		} catch (JAXBException e) {
	
			e.printStackTrace();
		}
	

		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

