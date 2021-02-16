package com.jspiders.springreferenceinjection.bank;

import org.springframework.stereotype.Component;

@Component("sav")
public class Savings implements Account{

	@Override
	public void deposit() {
		System.out.println("Deposit to Savings Account");
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw from Savings Account");
	}

}
