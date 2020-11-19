package com.jspiders.spring.springcore.reference;

public class Address {
	
	private String city;
	private String street;
	private int pincode;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", pincode=" + pincode + "]";
	}
	
	
}
