package com.jspiders.springreferenceinjection.bank;

import org.springframework.stereotype.Component;

@Component
public class Current implements Account{
	
	@Override
	public void deposit() {
		System.out.println("Deposit to Current Account");
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw from Current Account");
	}
	
}
