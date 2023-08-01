package com.lumen.basic;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int [] Array= {20,20,10,40,30};
		for(int i=0;i<Array.length;i++) {
			for(int j=i+1;j<Array.length;j++) {
				if(Array[i]==Array[j]) {
					System.out.println(Array[i]);
				}
			}
		}
	}

}
