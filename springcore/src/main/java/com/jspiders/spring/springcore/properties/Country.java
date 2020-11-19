package com.jspiders.spring.springcore.properties;

import java.util.Properties;

public class Country {
	
	private String name;
	private Properties StateAndLanguage;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Properties getStateAndLanguage() {
		return StateAndLanguage;
	}
	public void setStateAndLanguage(Properties stateAndLanguage) {
		StateAndLanguage = stateAndLanguage;
	}
	
	@Override
	public String toString() {
		return "Country [name=" + name + ", StateAndLanguage=" + StateAndLanguage + "]";
	}
	
	
}
