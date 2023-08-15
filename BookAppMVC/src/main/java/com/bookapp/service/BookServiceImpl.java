package com.bookapp.service;
import com.bookapp.model.*;
import java.util.List;

import java.util.stream.Collectors;

import com.bookapp.dao.BookDaoImpl;
import com.bookapp.dao.IBookdao;
import com.bookapp.exceptions.BookNotFoundException;
//import com.lumen.model.Book;

public class BookServiceImpl implements IBookService{
	
	IBookdao bookdao=new BookDaoImpl();

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return bookdao.findAll();
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books=bookdao.findByAuthorContains(author);
		if(books.size()==0) {
			throw new BookNotFoundException("Book Not Found");
		}
		books.stream().sorted().collect(Collectors.toList());
		
		//books.stream().sorted()
		return books;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> books=bookdao.findByCategory(category);
		if(books.size()==0) {
			throw new BookNotFoundException("Book Not Found");
		}
		books.stream().sorted().collect(Collectors.toList());
		return books;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books=bookdao.findByPriceLessThan(price);
		if(books.size()==0) {
			throw new BookNotFoundException("Book Not Found");
		}
		books.stream().sorted().collect(Collectors.toList());
		return books;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books=bookdao.findByAuthorContainsAndCategory(author,category);
		if(books.size()==0) {
			throw new BookNotFoundException("Book Not Found");
		}
		books.stream().sorted().collect(Collectors.toList());
		return books;
	}

	@Override
	public List<Book> getById(int bookid) throws BookNotFoundException {
		List<Book> books=bookdao.findById(bookid);
		if(books.size()==0) {
			throw new BookNotFoundException("Book Not Found");
		}
		books.stream().sorted().collect(Collectors.toList());
		return books;
	}

	@Override
	public void addBook(Book book) {
		bookdao.addBook(book);
		
	}

	@Override
	public void updateBook(int bookId, double price) {
		bookdao.updateBook(bookId, price);
	}

	@Override
	public void deleteBook(int bookId) {
		bookdao.deleteBook(bookId);
		
	}
	
}
