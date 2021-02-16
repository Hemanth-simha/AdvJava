package com.jspiders.springconstructorinjection.ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAddition {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("com/jspiders/springconstructorinjection/ambiguity/springconfig.xml");
		
		Addition add = (Addition) context.getBean("addition");
		
		if (context != null) {
			context.close();
		}
		
	}

}
