package com.lumen.basic;

public class SumAndAverage {

	public static void main(String[] args) {
		int [] Array= {10,20,30,40};
		int sum=0;
		for(int digit:Array) {
			sum=sum+digit;
		}
		System.out.println(sum);
		System.out.println(sum/Array.length);
		
	}

}
