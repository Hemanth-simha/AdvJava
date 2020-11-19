package com.jspiders.designpatterns.copyconstructor;

public class Person{

	int id;
	String name;
	Address address;
	
	public Person(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}

	public Person(Person person) {
		
		this.id=person.id;
		this.name=person.name;
		this.address=new Address(person.address);
	}
	

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
