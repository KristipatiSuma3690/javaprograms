package com.lumen.inherdemos;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		super.withdraw(amount);
		System.out.println(amount-150);
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		System.out.println(amount+150);
	}
	

}
