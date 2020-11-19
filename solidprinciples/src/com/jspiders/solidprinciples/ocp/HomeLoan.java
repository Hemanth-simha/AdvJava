package com.jspiders.solidprinciples.ocp;

public class HomeLoan implements Customer{

	@Override
	public boolean isLoyalCustomer() {
		return false;
	}

}
