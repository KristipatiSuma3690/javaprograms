package com.lumen.basic;

public class SmallestInArray {
	
	public static void main(String[] args) {
		int[] Array = {10,-3,45,88,65};
		int smallestNumber=Array[0];
		for(int number : Array) {
			if(number<smallestNumber)
				smallestNumber=number;}
				
		System.out.println("smallest number in the array is : "+smallestNumber);
	}
}


