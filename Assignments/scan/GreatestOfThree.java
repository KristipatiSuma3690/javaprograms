package com.lumen.scan;

import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {
		System.out.print("Enter three numbers:");
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int num3=scanner.nextInt();
		System.out.println((num1>num2 && num1>num3)?"num1 is greater":((num2>num3)?"num2 is greater":"num3 is greater"));
		scanner.close();
	}
}

		    

		    

		    

		 

		
