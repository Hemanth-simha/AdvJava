package com.jspiders.designpatterns.adapter;

import java.util.ArrayList;

public class Mainclass {

	public static void main(String[] args) {
		
		int a = 100;
		
		ArrayList list = new ArrayList();
		list.add(a);
		
		Object obj = list.get(0);
		System.out.println(obj);
	}

}
