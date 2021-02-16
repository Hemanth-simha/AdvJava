package com.jspiders.springreferenceinjection.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/springreferenceinjection/dependencycheck/springconfig.xml");
		
	 User user1 = (User) context.getBean("user");
	 
	 
	  User user2 = (User) context.getBean("user");
	 
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());
		
		if (context != null) {
			context.close();
		}
		
	}

}
