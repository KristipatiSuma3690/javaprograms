package com.lumen.absdemos;

public class Current extends Account{

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance=balance-amount-140;
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		balance=balance+amount+60;
	}
	

}
