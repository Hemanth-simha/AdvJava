package com.jspiders.solidprinciples.dip;

public class Mainclass {

	public static void main(String[] args) {
		
		GetProduct getProduct = new GetProduct();
		
		DisplayProduct displayProduct = new DisplayProduct(getProduct);
		displayProduct.display();
	}

}