package com.lumen.inherdemos;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double bal=scanner.nextDouble();
		double amount=scanner.nextDouble();
		
		Account account1=new Savings(bal);
		System.out.println("enter type saving or current");
		String Type=scanner.next();
		System.out.println("enter amounttype withdraw or deposit");
		String amountType=scanner.next();
		Account account2=new Current(amount);
		
		if(Type.equals("saving")) {
			if(amountType.equals("withdraw")) {
				account1.withdraw(amount);
				//System.out.println(account1.getBalance());
			}
			else {
				account1.deposit(amount);
			}
		}
		else {
			if(amountType.equals("withdraw")) {
				account2.withdraw(amount);
			}
			else {
				account2.deposit(amount);
			}
		}
		System.out.println(account1.getBalance());
		
		scanner.close();
		
		
		
	}

}
