package com.lumen.basic;

public class PrimeNumber {

	public static void main(String[] args) {
		int number=11;
		int count=0;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				count=count+1;
			}
		}
		if(count==0) {
			System.out.println("This is Prime Number");
		}
		else {
			System.out.println("This is Not Prime Number");
		}
	}

}
