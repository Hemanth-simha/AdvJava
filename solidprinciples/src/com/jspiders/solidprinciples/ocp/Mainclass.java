package com.jspiders.solidprinciples.ocp;

public class Mainclass {

	public static void main(String[] args) {
		
		HomeLoan customer = new HomeLoan();
		//GoldLoan customer = new GoldLoan();
		DiscountCalculator calculate = new DiscountCalculator();
		double discount = calculate.checkLoyality(customer);
		
		System.out.println("Customer discount is : "+discount);
	}

}
