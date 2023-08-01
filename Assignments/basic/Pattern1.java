package com.lumen.basic;

public class Pattern1 {

	public static void main(String[] args) {
		int number=5;
		for(int i=1;i<number;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
