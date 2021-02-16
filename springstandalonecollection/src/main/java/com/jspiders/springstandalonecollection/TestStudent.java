package com.jspiders.springstandalonecollection;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("com/jspiders/springstandalonecollection/springconfig.xml");
		
		Student student = (Student) context.getBean("student");
		
		List<String> subjects= student.getSubjects();
		
		System.out.println(student);
		System.out.println(subjects.getClass());
		
		if (context != null) {
			context.close();
		}
		
	}
	

}
