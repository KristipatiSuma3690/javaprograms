package com.lumen.scan;

import java.util.Scanner;

public class OneDArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter array size:");
		int arraySize=scanner.nextInt();
		int [] array=new int[arraySize];
		System.out.print("Elements:");
		for(int i=0;i<arraySize;i++)
			array[i]=scanner.nextInt();
		int sum=0;
		for(int arr:array)
			sum+=arr;
		System.out.println("Sum: "+sum);
		double average=sum/arraySize;
		System.out.println("Average: "+average);
		scanner.close();
			
	}

}
