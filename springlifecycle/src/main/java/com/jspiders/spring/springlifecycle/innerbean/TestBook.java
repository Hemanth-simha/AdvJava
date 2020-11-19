package com.jspiders.spring.springlifecycle.innerbean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/springlifecycle/innerbean/springconfig.xml");
		
		Book book1 = (Book) context.getBean("book");
		
		Book book2 = (Book) context.getBean("book");
		
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
		
		if (context != null) {
			context.close();
		}
		
	}

}
