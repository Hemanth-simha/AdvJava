package com.jspiders.spring.springconstructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPassenger {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/springconstructorinjection/springconfig.xml");
		

		Passenger passenger =   (Passenger) context.getBean("passenger");
		
		System.out.println(passenger);
		
		if (context != null) {
			context.close();
		}
		
	}

}
