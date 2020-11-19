package com.jspiders.spring.springconstructorinjection.ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEntity {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/springconstructorinjection/ambiguity/springconfig.xml");
		
		Entity entity =  (Entity) context.getBean("entity");
		
		System.out.println(entity);
		
		if (context != null) {
			context.close();
		}
		
	}

}
