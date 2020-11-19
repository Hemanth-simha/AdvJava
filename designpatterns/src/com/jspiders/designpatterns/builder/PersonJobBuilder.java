package com.jspiders.designpatterns.builder;

public class PersonJobBuilder extends PersonBuilder {

	public PersonJobBuilder(Person person) {
		this.person = person;
	}

	public PersonJobBuilder CompanyIs(String company) {
		person.company = company;
		return this;
	}

	public PersonJobBuilder positionIs(String position) {
		person.position = position;
		return this;
	}

	public PersonJobBuilder salaryIs(double salary) {
		person.salary = salary;
		return this;
	}

}
