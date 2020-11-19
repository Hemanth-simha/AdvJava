package com.jspiders.spring.springcore;

public class Student {

	private int regno;
	private String name;
	private double marks;
	
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [regno=" + regno + ", name=" + name + ", marks=" + marks + "]";
	}
}
