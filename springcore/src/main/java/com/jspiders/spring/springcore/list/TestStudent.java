package com.jspiders.spring.springcore.list;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/springcore/list/springconfig.xml");		
		
		Student student =(Student) context.getBean("student");
		
		List<String> list= student.getSubjects();
		
		System.out.println(student);
		System.out.println(list.getClass());
		
		if(context != null) {
			context.close();
		}
		
	}

}
