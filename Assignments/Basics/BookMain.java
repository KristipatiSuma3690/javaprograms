package com.lumen.Basics;

public class BookMain {

	public static void main(String[] args) {
		Book book=new Book();
		book.title="Girl in the room no 310";
		book.author="chetan bagat";
		book.Price=2000.0;
		book.printdetails();
		System.out.println(book.getDiscountedPrice(500.0));

	}

}
