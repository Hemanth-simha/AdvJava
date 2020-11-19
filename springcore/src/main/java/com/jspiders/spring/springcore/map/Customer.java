package com.jspiders.spring.springcore.map;

import java.util.Map;

public class Customer {

	private String email;
	private Map<Integer, String> product;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Map<Integer, String> getProduct() {
		return product;
	}

	public void setProduct(Map<Integer, String> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", product=" + product + "]";
	}

}
