package com.jspiders.springreferenceinjection.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Scope("prototype")
public class Customer {

	@Value("111")
	private int id;
	
	@Value("Dinga")
	private String name;
	
	@Autowired
	@Qualifier("sav")
	private Account account;

	
	public void hii() {
		System.out.println("Init()-Method.....");
	}
	
	public void bye() {
		System.out.println("Destroy()-Method.....");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", account=" + account + "]";
	}

}
