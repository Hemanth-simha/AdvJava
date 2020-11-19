package com.jspiders.spring.springcore.set;

import java.util.Set;

public class Person {
	
	private String name;
	private String location;
	private Set<Long> contact;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<Long> getContact() {
		return contact;
	}
	public void setContact(Set<Long> contact) {
		this.contact = contact;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", location=" + location + ", contact=" + contact + "]";
	}
}
