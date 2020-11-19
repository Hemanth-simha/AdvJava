package com.jspiders.spring.springcore.reference;

public class Person {

	private String name;
	private Address address_home;
	private Address address_office;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress_home() {
		return address_home;
	}

	public void setAddress_home(Address address_home) {
		this.address_home = address_home;
	}

	public Address getAddress_office() {
		return address_office;
	}

	public void setAddress_office(Address address_office) {
		this.address_office = address_office;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address_home=" + address_home + ", address_office=" + address_office + "]";
	}

}
