package com.lumen.basic;

public class FactorialNumber {

	public static void main(String[] args) {
		int number=4;
		int i=1;
		int product=1;
		while(i<=number) {
			product=product*(i);
			i=i+1;	
		}
		System.out.println(product);
	}

}
