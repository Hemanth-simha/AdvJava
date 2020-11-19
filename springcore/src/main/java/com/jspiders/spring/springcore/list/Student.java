package com.jspiders.spring.springcore.list;

import java.util.List;

public class Student {

	private int regno;
	private String name;
	private List<String> subjects;
	
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	@Override
	public String toString() {
		return "Student [regno=" + regno + ", name=" + name + ", subjects=" + subjects + "]";
	}
	
	
}
