package com.lumen.Basics;

public class Book {
	String title;
	String author;
	double Price;
	
	void printdetails() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(Price);
	}
	double getDiscountedPrice(double amount) {
		return Price-amount;
	}
	
}
