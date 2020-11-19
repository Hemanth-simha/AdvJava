package com.jspiders.spring.springlifecycle.innerbean;

public class Author {
	
	private String name;
	private String email;
	private long contact;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	
	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", contact=" + contact + "]";
	}
	
}
