package com.jspiders.spring.springautowiring;

public class Employee {
	
	private int empno;
	private String ename;
	private Address address;
	
	public Employee(int empno, String ename, Address address) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.address = address;
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
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", address=" + address + "]";
	}
	
	
	
}
