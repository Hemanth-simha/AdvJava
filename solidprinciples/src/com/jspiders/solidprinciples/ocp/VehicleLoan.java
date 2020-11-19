package com.jspiders.solidprinciples.ocp;

public class VehicleLoan implements Customer {

	@Override
	public boolean isLoyalCustomer() {
		return false;
	}

}
