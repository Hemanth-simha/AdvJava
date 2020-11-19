package com.jspiders.designpatterns.singleton;

public class Product {

	private static final Product product = new Product();
	
	private Product() {
		System.out.println("Object is created");
	}

	public static Product getInstance() {
		return product;
	}
}
