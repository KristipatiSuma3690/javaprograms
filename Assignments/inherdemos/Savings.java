package com.lumen.inherdemos;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		
		balance=balance-amount-120;
		System.out.println(balance);
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		
		balance=balance+amount+140;
		System.out.println(balance);
	}
	

}
