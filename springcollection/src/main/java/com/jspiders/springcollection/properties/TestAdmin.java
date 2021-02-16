package com.jspiders.springcollection.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdmin {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("com/jspiders/springcollection/properties/springconfig.xml");
		
		Admin admin = (Admin) context.getBean("admin");
		
		System.out.println(admin);
		
		if (context != null) {
			context.close();
		}
		
	}

}
