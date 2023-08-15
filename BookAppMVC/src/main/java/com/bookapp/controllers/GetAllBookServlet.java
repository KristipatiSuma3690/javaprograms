package com.bookapp.controllers;

import java.awt.print.Book;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;
import com.bookapp.model.*;

/**
 * Servlet implementation class GetAllBookServlet
 */
@WebServlet("/all")
public class GetAllBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IBookService iBookService=new BookServiceImpl();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<com.bookapp.model.Book> books=iBookService.findAll();
		request.setAttribute("books", books);
		RequestDispatcher dispatcher=request.getRequestDispatcher("home.jsp");
		dispatcher.include(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
