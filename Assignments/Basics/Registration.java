package com.lumen.Basics;

import java.util.Scanner;

public class Registration {

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
			System.out.println("enter unique name");
		else
			System.out.println("you are succesfully registered.");
		scanner.close();
		
				
		
		

	}

}
