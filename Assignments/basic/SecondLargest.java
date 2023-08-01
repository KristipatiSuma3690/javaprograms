package com.lumen.basic;

public class SecondLargest {

	public static void main(String[] args) {
		int [] Array= {10,9,5,30,14};
		int largerNumber=-99999;
		int secondLarger=-99999;
		for(int number:Array) {
			if(number>largerNumber) {
				secondLarger=largerNumber;
				largerNumber=number;
				
			}
			else if(number<largerNumber && number>secondLarger) {
				secondLarger=number;
			}
			
		}
		System.out.println(secondLarger);
		
	}

}
