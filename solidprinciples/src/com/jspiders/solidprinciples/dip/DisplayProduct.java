package com.jspiders.solidprinciples.dip;

public class DisplayProduct {

	GetProduct getProduct;
	
	public DisplayProduct(GetProduct getProduct) {
		this.getProduct=getProduct;
	}
	
	public void display()
	{
		Product product = getProduct.getService(); 
		int products = product.readProducts();
		System.out.println("Products per page is : "+products/10);
	}

	public GetProduct getGetProduct() {
		return getProduct;
	}

	public void setGetProduct(GetProduct getProduct) {
		this.getProduct = getProduct;
	}
	
	
	
}
