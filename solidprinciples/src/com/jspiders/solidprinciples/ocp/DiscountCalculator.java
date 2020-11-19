package com.jspiders.solidprinciples.ocp;

public class DiscountCalculator {

	double discount = 20.0;
	
	public double checkLoyality(Customer customer) {
		
		if(customer.isLoyalCustomer()) {
			discount = discount * 1.5;
		}
		return discount;
	}
	
}
