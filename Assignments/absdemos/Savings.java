package com.lumen.absdemos;

public class Savings extends Account{

	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance=balance-amount-150;
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		balance=balance+amount+50;
	}
	

}
