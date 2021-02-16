package com.jspiders.springcollections.map;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCountry {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("com/jspiders/springcollections/map/springconfig.xml");
		
		Country country =  (Country) context.getBean("country");
		
		System.out.println(country);
		
		Map<String, String> stateAndLangs = country.getStateAndLangs();
		System.out.println(stateAndLangs.getClass());
		
		if (context != null) {
			context.close();
		}
		
	}

}
