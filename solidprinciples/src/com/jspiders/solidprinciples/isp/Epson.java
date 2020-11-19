package com.jspiders.solidprinciples.isp;

public class Epson implements PrintMachine,ScanMachine{

	@Override
	public void print() {
		System.out.println("print no. of copies by Epson");
		
	}

	@Override
	public void scan() {
		System.out.println("print no. of copies by Epson");
		
	}

}
