package com.jspiders.springreferenceinjection.bank;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("com/jspiders/springreferenceinjection/bank/springconfig.xml");
		
		Customer customer1 = (Customer) context.getBean("customer");
		
		Customer customer2 = (Customer) context.getBean("customer");
		
		
		System.out.println(customer1.hashCode());
		System.out.println(customer2.hashCode());
		
		if (context != null) {
			context.close();
		}
		
	}

}
