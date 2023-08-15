package com.bookapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/addBook")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IBookService iBookService=new BookServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title=request.getParameter("title");
		String author=request.getParameter("author");
		String category=request.getParameter("category");
		int bookId=Integer.parseInt(request.getParameter("bookId"));
		double price=Double.parseDouble(request.getParameter("price"));
		
		Book book=new Book();
		book.setTitle(title);
		book.setAuthor(author);
		book.setCategory(category);
		book.setBookId(bookId);
		book.setPrice(price);
		
		iBookService.addBook(book);
		request.setAttribute("message", "Book successfully added...");
		//request.setAttribute("message", "Hello Everyone");
		request.setAttribute("book", book);
		RequestDispatcher dispatcher =request.getRequestDispatcher("final.jsp");
		dispatcher.forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
