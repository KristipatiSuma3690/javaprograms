package com.lumen.Basics;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String [] usernames= {"venu","usha","lokesh"};
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter username:");
		String username=scanner.nextLine();
		int count=0;
		for(String name:usernames) {
			if(username.equals(name)) {
				count=1;
			}}
		if(count==1)
			System.out.println("You are logged in Successfully");
		else
			System.out.println("Invalid Username.");
		scanner.close();
	}

}
