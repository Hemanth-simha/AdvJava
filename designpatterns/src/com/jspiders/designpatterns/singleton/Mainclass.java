package com.jspiders.designpatterns.singleton;

public class Mainclass {

	public static void main(String[] args) {
		
		Product u1 = Product.getInstance();
		Product u2 = Product.getInstance();
		Product u3 = Product.getInstance();
	}

}
