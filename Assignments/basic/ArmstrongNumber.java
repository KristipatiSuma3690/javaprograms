package com.lumen.basic;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number=345;
		String string=Integer.toString(number);
		int n=string.length();
		int Armstrongnumber=0;
		int temp=number;
		while(temp>0) {
			int num=temp%10;
			Armstrongnumber=Armstrongnumber+(int)Math.pow(num,n);
			temp=temp/10;
			
		}
		if(number==Armstrongnumber) {
			System.out.println("This is Armstrong Number");
		}
		else {
			System.out.println("This is not Armstrong Number");
		}
	}

}
