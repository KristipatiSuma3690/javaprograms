package com.lumen.basic;

public class SecondSmallest {
	public static void main(String[] args) {
		
	
		int [] Array= {10,9,5,30,14,-1,-2};
		int smallNumber=Array[0];
		for(int number:Array) {
			if(number<smallNumber)
				smallNumber=number;
		}
		int secondNumber=Array[0];
		for(int number:Array) {
			if(number>smallNumber && number<secondNumber) {
				secondNumber=number;
			}
		}
		System.out.println(secondNumber);
		
	}

}
