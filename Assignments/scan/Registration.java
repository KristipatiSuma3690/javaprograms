package com.lumen.scan;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		String[] usernames= {"venu","lokesh","usha","vahathi"};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter username:");
		String name=scanner.next();
		
		boolean flag=true;
		for(String username:usernames) {
			if(username.equals(name)) {
				flag=false;
				System.out.println("Name is not unique");
			}
			
		}
		if(flag)
			System.out.println("You are registered");
		scanner.close();

	}

}
