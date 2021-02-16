package com.jspiders.springjdbc;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("com/jspiders/springjdbc/springconfig.xml");
		
		Student student = (Student) context.getBean("student");
		
		StudentDAOImpl studentDAO =  (StudentDAOImpl) context.getBean("studentDAO");
		
//		int result = studentDAO.create(student);
//		System.out.println("Number of records inserted : "+result);
//		
		//Student student = studentDAO.read(101);
//		List<Student> students= studentDAO.readAll();
//		
//		for(Student student : students)
//		{
//			System.out.println(student);
//		}
		
//		int result = studentDAO.delete(101);
//		System.out.println("Number of records deleted are : "+result);
//		
		
		int result = studentDAO.update(student);
		
		System.out.println("Number of records updated are : "+result );
		
		if (context != null) {
			context.close();
		}
		
	}

}
