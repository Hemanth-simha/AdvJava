package com.jspiders.springcoretest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollege {

	public static void main(String[] args) {
		
ClassPathXmlApplicationContext context = null; 
		
		context = new ClassPathXmlApplicationContext
				("com/jspiders/springcoretest/springconfig.xml");
		College college =(College) context.getBean("college");
		System.out.println(college);
		
		if(context!=null) {
			context.close();
		}
		
		
		
	}

}
