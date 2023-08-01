package com.lumen.inherdemos;

public class Account {
	double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	void withdraw(double amount) {
		System.out.println(balance-amount);
	}
	void deposit(double amount) {
		System.out.println(balance+amount);
	}
	double getBalance() {
		return balance;
	}
	
	

}
