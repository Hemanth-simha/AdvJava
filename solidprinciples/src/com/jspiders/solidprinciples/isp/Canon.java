package com.jspiders.solidprinciples.isp;

public class Canon implements PrintMachine,ScanMachine,FaxMachine{

	@Override
	public void print() {
		System.out.println("print no. of copies by canon");
		
	}

	@Override
	public void scan() {
		System.out.println("scan no. of copies by canon");
		
	}

	@Override
	public void fax() {
		System.out.println("fax by canon");
		
	}

}
