package com.jspiders.designpatterns.prototype;

public class Address implements Cloneable{

	String state;
	String city;
	int pincode;
	
	public Address(String state,String city,int pincode) {
		this.state=state;
		this.city=city;
		this.pincode=pincode;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Address(state,city,pincode);
	}
	
	
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
}
