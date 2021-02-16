package com.jspiders.springautowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCompany {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/springautowire/springconfig.xml");
		
		Company company = (Company) context.getBean("company");
		System.out.println(company);
		
		if (context != null) {
			context.close();
		}
		
	}

}
