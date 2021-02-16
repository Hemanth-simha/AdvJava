package com.jspiders.springstandalonecollection;

import java.util.List;

public class Student {

	private int id;
	private String name;
	private double marks;
	private List<String> subjects;

	public void hii()
	{
		System.out.println("Inside hii()-Method");
	}
	
	public void bye()
	{
		System.out.println("Inside bye()-Method");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setId()-Method");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", subjects=" + subjects + "]";
	}

}
