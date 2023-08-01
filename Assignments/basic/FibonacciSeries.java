package com.lumen.basic;

public class FibonacciSeries {

	public static void main(String[] args) {
		int number=10;
		int first=0;
		int second =1;
		int third =0;
		for(int i=1;i<= number ;i++) {
			System.out.println(third);
			third = first+second;
			first = second;
			second = third;
		}
	}

}
