package com.lumen.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;
import com.lumen.util.BookDetails;

public class BookServiceImpl implements IBookService{

	

	@Override
	public List<Book> getAll() {
		List<Book> books=BookDetails.showBooks();
		return books;
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books=getAll();
		
		List<Book> getbyauthorcontains= books.stream()
				.filter((book)->book.getAuthor().contains(author))
				.collect(Collectors.toList());
		
		
		if(getbyauthorcontains.size()==0) {
			throw new BookNotFoundException("Book not found");
		
		}
		return getbyauthorcontains;
		
		
	}


	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> books=getAll();
		List<Book> getbycategory= books.stream()
				.filter((book)->book.getCategory().equalsIgnoreCase(category))
				.collect(Collectors.toList());
		
		if(getbycategory.size()==0) {
			throw new BookNotFoundException("Book not found");
		
		}
		return getbycategory;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books=getAll();
		
		List<Book> getbypricelessthan= books.stream()
				.filter((book)->book.getPrice()<price)
				.collect(Collectors.toList());
		
		
		if(getbypricelessthan.size()==0) {
			throw new BookNotFoundException("Book not found");
		
		}
		return getbypricelessthan;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books=getAll();
		List<Book> getbyauthorcontainsandcategory= books.stream()
				.filter((book)->book.getAuthor().contains(category))
				.filter((book)->book.getCategory().equals(category))
				.collect(Collectors.toList());
		
		if(getbyauthorcontainsandcategory.size()==0) {
			throw new BookNotFoundException("Book not found");
		
		}
		
		return getbyauthorcontainsandcategory;
	}

	@Override
	public List<Book> getById(int bookId) throws BookNotFoundException {
		List<Book> books=getAll();
		List<Book> getbyid= books.stream()
				.filter((book)->book.getBookId()==(bookId))
				.collect(Collectors.toList());
		
		if(getbyid.size()==0) {
			throw new BookNotFoundException("Book not found");
		
		}
		return getbyid;
	}

}
