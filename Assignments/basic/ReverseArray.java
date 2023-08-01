package com.lumen.basic;

public class ReverseArray {

	public static void main(String[] args) {
			int [] Array= {20,30,40,50};
			int [] Array2=new int[Array.length];
			for(int i=0;i<Array.length;i++) {
				Array2[i]=Array[Array.length-i-1];				
			}
			for(int number:Array2) {
				System.out.println(number);
			}
	}

}
