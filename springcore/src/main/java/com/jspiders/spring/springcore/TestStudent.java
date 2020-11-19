package com.jspiders.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/springcore/springconfig.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		
		if(context!=null) {
			context.close();
		}
	}

}
