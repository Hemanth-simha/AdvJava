package com.jspiders.springcollections.map;

import java.util.Map;

public class Country {
	
	private String name;
	private Map<String,String> stateAndLangs;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getStateAndLangs() {
		return stateAndLangs;
	}
	public void setStateAndLangs(Map<String, String> stateAndLangs) {
		this.stateAndLangs = stateAndLangs;
	}
	
	@Override
	public String toString() {
		return "Country [name=" + name + ", stateAndLangs=" + stateAndLangs + "]";
	}
	
	
	
}
