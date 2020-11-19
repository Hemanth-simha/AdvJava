package com.jspiders.solidprinciples.dip;

public class GetProduct {

	public Product getService()
	{
		Product product = new SQLRepository();
		return product;
	}
	
}
