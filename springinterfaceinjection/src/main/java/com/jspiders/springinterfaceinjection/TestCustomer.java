package com.jspiders.springinterfaceinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("com/jspiders/springinterfaceinjection/springconfig.xml");
		
		 Customer customer = (Customer) context.getBean("customer");
		 Account account = customer.getAccount();
		 System.out.println(customer);
		 account.deposit();
		 account.withdraw();
		 
		 if (context != null) {
			context.close();
		}
		 
		
	}

}
