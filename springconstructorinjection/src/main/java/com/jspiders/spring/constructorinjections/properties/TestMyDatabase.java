package com.jspiders.spring.constructorinjections.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyDatabase {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/constructorinjections/properties/springconfig.xml");
		
		MyDatabase myDB =  (MyDatabase) context.getBean("myDatabase");
		
		System.out.println(myDB);
		
		if (context != null) {
			context.close();
		}
		
	}

}
