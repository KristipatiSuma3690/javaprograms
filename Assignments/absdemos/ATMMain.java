package com.lumen.absdemos;

public class ATMMain {

	public static void main(String[] args) {
		double bal=20000;
		Bank bank=new Account(bal);
		System.out.println(bank.getBalance());
		bank.withdraw(3000.0);
		System.out.println(bank.getBalance());
		
		
		bank=new Savings(bal);
		bank.deposit(4000.0);
		System.out.println(bank.getBalance());
		
		
		
		bank=new Current(bal);
		bank.withdraw(2000);
		bank.deposit(4000);
		System.out.println(bank.getBalance());
		
		
	}

}
