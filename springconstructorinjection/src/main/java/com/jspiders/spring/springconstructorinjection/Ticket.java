package com.jspiders.spring.springconstructorinjection;

public class Ticket {
	
	private long id;
	private String departure;
	private String arrival;
	
	public Ticket(long id,String departure,String arrival)
	{
		this.id=id;
		this.departure=departure;
		this.arrival=arrival;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", departure=" + departure + ", arrival=" + arrival + "]";
	}

}
