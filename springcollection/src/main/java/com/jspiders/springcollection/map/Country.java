package com.jspiders.springcollection.map;

import java.util.Map;

public class Country {

	private String name;
	private Map<String, String> stateAndLang;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getStateAndLang() {
		return stateAndLang;
	}

	public void setStateAndLang(Map<String, String> stateAndLang) {
		this.stateAndLang = stateAndLang;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", stateAndLang=" + stateAndLang + "]";
	}
}
