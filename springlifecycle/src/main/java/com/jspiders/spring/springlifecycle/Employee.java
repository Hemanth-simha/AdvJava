package com.jspiders.spring.springlifecycle;

import org.springframework.beans.factory.annotation.Required;

public class Employee {

	private int empno;
	private String ename;
	private double salary;

	public void hii() {
		System.out.println("Initializing Bean......");
	}

	public void bye() {
		System.out.println("Destroy Bean.......");

	}

	public int getEmpno() {
		return empno;
	}

	
	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	@Required
	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + "]";
	}

}
