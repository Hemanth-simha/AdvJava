package com.jspiders.solidprinciples.srp;

public class Mainclass {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setId(101);
		person.setName("Blake");
		person.setSalary(30033.33);
		
		PersonInsertDetails.save(person);
	}

}
