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
		IBookService bookservice=new BookServiceImpl();
		List<Book> books=new ArrayList<>();
		
		Scanner scanner=new Scanner(System.in);
		//System.out.println("Enter which type to check");
		String inputauthor=scanner.nextLine();
		
		books=bookservice.getByAuthorContains(inputauthor);
		System.out.println(books);
		
		
		
		int inputbookid=scanner.nextInt();
		books=bookservice.getById(inputbookid);
		System.out.println(books);
		
		
		
		
		
	}

}
