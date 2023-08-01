package com.lumen.basic;

public class ReverseNumber {

	public static void main(String[] args) {
		int number=345;
		int reverseNumber=0;
		while(number>0) {
			int temp=number%10;
			reverseNumber=reverseNumber*10+temp;
			number=number/10;
					
		}
		System.out.println(reverseNumber);
	}

}
