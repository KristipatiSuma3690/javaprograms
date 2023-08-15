package com.lumen.dao;

import java.util.List;

import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;

public interface IBookdao {
	void addBook(Book book);
	void updateBook(int bookId, double price);
	void deleteBook(int bookId);
	
	
	List<Book> findAll();
	List<Book> findByAuthorContains(String author)throws BookNotFoundException;
	List<Book> findByCategory(String category) throws BookNotFoundException;
	List<Book> findByPriceLessThan(double price) throws BookNotFoundException;
	List<Book> findByDatePublished(int year) throws BookNotFoundException;
	List<Book> findByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException;
	Book findById(int bookId) throws BookNotFoundException;


}
