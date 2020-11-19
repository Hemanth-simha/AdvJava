package com.jspiders.designpatterns.prototype;

public class Mainclass {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Address address = new Address("Karnataka","Bangalore",560004);
		
		Person person1 = new Person(101,"king",address);
	
		Person person2 =(Person) person1.clone();
		
		person2.name="Queen";
		person2.address.pincode=560006;
		
		
		System.out.println("Person1 : "+person1);
		System.out.println("Person2: "+person2);
	}

}
