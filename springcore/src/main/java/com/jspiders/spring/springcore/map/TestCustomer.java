package com.jspiders.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/springcore/map/springconfig.xml");		
		
		Customer customer =  (Customer) context.getBean("customer");
		
		System.out.println(customer);
		
		if(context != null) {
			context.close();
		}
		

	}

}
