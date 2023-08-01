package com.lumen.scan;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		String[] usernames= {"venu","lokesh","usha","vahathi"};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter username:");
		String name=scanner.next();
		boolean flag=true;
		for(String username:usernames) {
			if(username.equals(name)) {
				flag=false;
				System.out.println("You are logged in successfully");
			}
			
		}
		if(flag)
			System.out.println("Invalid Username");
		scanner.close();

	}
	

}
