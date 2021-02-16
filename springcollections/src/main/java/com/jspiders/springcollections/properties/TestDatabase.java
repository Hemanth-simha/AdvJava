package com.jspiders.springcollections.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDatabase {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext
		  ("com/jspiders/springcollections/properties/springconfig.xml");
		
		Database database =  (Database) context.getBean("database");
		
		System.out.println(database);
		
		if (context != null) {
			context.close();
		}
		
	}

}
