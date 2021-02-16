package com.jspiders.springautowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {
	
	private String companyName;
	
	@Autowired
	private Employee employee;//has-a

	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", employee=" + employee + "]";
	}
	
	
	
}
