package com.jspiders.springreferenceinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext
		("com/jspiders/springreferenceinjection/springconfig.xml");
		
	   Person person = (Person) context.getBean("person");
		
	   System.out.println(person);
		
	   if (context != null) {
		context.close();
	}
	}

}
