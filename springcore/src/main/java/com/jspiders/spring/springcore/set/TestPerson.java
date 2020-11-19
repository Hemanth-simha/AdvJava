package com.jspiders.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/springcore/set/springconfig.xml");
		
		Person person =(Person) context.getBean("person");

		System.out.println(person);
		System.out.println(person.getContact().getClass());
		
		if(context!=null) {
			context.close();
		}
	}

}
