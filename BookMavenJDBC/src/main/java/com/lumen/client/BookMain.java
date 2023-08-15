package com.lumen.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;
import com.lumen.service.BookServiceImpl;
import com.lumen.service.IBookService;

public class BookMain {

	public static void main(String[] args) {
		Book book;
		Book book1=new Book("gre","goolf","tech",1,800.0);
		IBookService bookservice=new BookServiceImpl();
		List<Book> books=new ArrayList<>();
		//Book book11=new Book();
		//bookservice.addBook(new Book("gre2","tom","ecom",7,900.0));
		//bookservice.addBook(new Book("gre3","jerry","tech",8,600.0));
		//books=bookservice.findAll();
		//books=bookservice.getByAuthorContains("tom");
		//books=bookservice.getByAuthorContainsAndCategory("tom", "ecom");
		book=bookservice.getById(5);
		System.out.println(book);
		
		//books.forEach((book11)->System.out.println(book));
		
		
	}
	

}
;