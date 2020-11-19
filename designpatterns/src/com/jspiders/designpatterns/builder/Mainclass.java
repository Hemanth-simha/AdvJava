package com.jspiders.designpatterns.builder;

public class Mainclass {

	public static void main(String[] args) {
		
		PersonBuilder pb = new PersonBuilder();
		PersonAddressBuilder address= pb.lives();
		
		address.stateIn("Karnataka");
		address.cityIn("Bangalore");
		address.pincodeIs(560004);
		
		PersonJobBuilder job = pb.works();
		
		job.CompanyIs("Microsoft");
		job.positionIs("Developer");
		job.salaryIs(30033.33);
		
		Person person = pb.build();
		
		System.out.println(person);
	}

}
