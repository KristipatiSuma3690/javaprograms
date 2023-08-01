package com.lumen.basic;

public class PerfectNumber {

	public static void main(String[] args) {
		int number=42;
		int perfectNumber=0;
		for(int i=0;i<number;i++) {
			if(number%i==0) {
				perfectNumber+=i;
			}
		}
		if(number==perfectNumber) {
			System.out.println("This is Perfect Number");
		}
		else {
			System.out.println("This is not Perfect Number");
		}
	}

}
