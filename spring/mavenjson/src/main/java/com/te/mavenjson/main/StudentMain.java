package com.te.mavenjson.main;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.te.mavenjson.bean.Student;
//Converting java object to JSON 
public class StudentMain {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Student student=new Student();
		student.setSid(100);
		student.setSname("tom");
		student.setPassword("jerry420");
		System.out.println(student);
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(System.out, student);

	}

}
