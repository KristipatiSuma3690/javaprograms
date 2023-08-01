package com.lumen.scan;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int num1=0;
		int num=number;
		while(num>0) {
			int temp=num%10;
			num1=num1*10+temp;
			num=num/10;	
		}
		if(number==num1)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
		scanner.close();
	}

}


