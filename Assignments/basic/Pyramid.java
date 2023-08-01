package com.lumen.basic;

public class Pyramid {

	public static void main(String[] args) {
		int number=5;
		for(int i=number;i>=1;i--) {
			for(int j=i-1;j>=1;j--) {
				System.out.print(" ");}
			for(int k=0;k<number-i+1;k++) {
				System.out.print("*");
			}
			for(int k=0;k<number-i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
			
