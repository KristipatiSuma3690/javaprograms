package com.lumen.basic;

public class GreatestInArray {

	public static void main(String[] args) {
		int [] array= {10,-9,45,88,1,4,8,48,8,65,21,65};
		int greatestNumber=array[0];
		for(int number : array) {
			if(number>greatestNumber) {
				greatestNumber=number;
			}
		}
		
		System.out.println("greatest number in the array is : "+greatestNumber);
	}

}
