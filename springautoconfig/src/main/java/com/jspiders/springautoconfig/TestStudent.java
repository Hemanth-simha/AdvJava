package com.jspiders.springautoconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestStudent {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = null;

		context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Student student = context.getBean(Student.class);

		StudentDAOImpl studentDAOImpl = context.getBean(StudentDAOImpl.class);
		int res = studentDAOImpl.create(student);
		
		System.out.println("Number of records inserted are : "+res);
		
		if (context != null) {
			context.close();
		}

	}

}
