package com.lumen.absdemos;

public class Account extends Bank {
	public Account(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}


	@Override
	void withdraw(double amount) {
		balance=balance-amount;
	}

	@Override
	void deposit(double amount) {
		balance=balance-amount;
	}

	

}
