package com.jspiders.spring.springconstructorinjection;

public class Passenger {

	private String name;
	private String email;
	private long contact;
	private int age;
	private Ticket ticket;

	public Passenger(String name, String email, long contact, int age, Ticket ticket) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.age = age;
		this.ticket = ticket;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + ", email=" + email + ", contact=" + contact + ", age=" + age + ", ticket="
				+ ticket + "]";
	}
}
