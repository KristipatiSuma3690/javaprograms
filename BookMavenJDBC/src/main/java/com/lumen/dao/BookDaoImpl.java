package com.lumen.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;

public class BookDaoImpl implements IBookdao {
//	String url="jdbc:mysql://localhost:3306/mysql";
//	String username="root";
//	String password="admin@123";
//	public boolean createBook(Book book) {
//		try(Connection connection = DriverManager.getConnection(url,username,password);
//				Statement statement = connection.createStatement()){
//			    //if(book)
//				
//				statement.execute(Queries.createquery);
//				return true;
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		return true;
//	}

	@Override
	public void addBook(Book book) {
		try (Connection connection = DbConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.insertQuery)) {
			statement.setString(1, book.getTitle());
			statement.setString(2, book.getAuthor());
			statement.setString(3, book.getCategory());
			statement.setInt(4, book.getBookId());
			statement.setDouble(5, book.getPrice());
			statement.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateBook(int bookId, double price) {
		try (Connection connection = DbConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.updateQuery)) {
			statement.setInt(1, bookId);
			statement.setDouble(2, price);
			statement.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteBook(int bookId) {
		try (Connection connection = DbConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.deleteQuery)) {
			statement.setInt(1, bookId);
			statement.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Book> findAll() {
		List<Book> booklist = new ArrayList<>();
		try (Connection connection = DbConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.query);
				ResultSet rs = statement.executeQuery()) {
			// booklist=new ArrayList<>();
			while (rs.next()) {
				String title = rs.getString("title");
				String author = rs.getString("author");
				String category = rs.getString("category");
				int bookid = rs.getInt("bookid");
				double price = rs.getDouble("price");
				Book book = new Book(title, author, category, bookid, price);
				booklist.add(book);

			}
			// return booklist;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return booklist;

	}

	@Override
	public List<Book> findByAuthorContains(String author) throws BookNotFoundException {
		List<Book> booklist = new ArrayList<>();
		try {
			Connection connection = DbConnection.openConnection();
			PreparedStatement statement = connection.prepareStatement(Queries.querybyauthor);
			statement.setString(1, "%" + author + "%");
			statement.execute();
			ResultSet rs = statement.executeQuery();

			// booklist=new ArrayList<>();
			while (rs.next()) {
				String title = rs.getString("title");
				String author2 = rs.getString("author");
				String category = rs.getString("category");
				int bookid = rs.getInt("bookid");
				double price = rs.getDouble("price");
				Book book = new Book(title, author2, category, bookid, price);
				booklist.add(book);

			}
			// return booklist;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return booklist;
	}

	@Override
	public List<Book> findByCategory(String category) throws BookNotFoundException {
		List<Book> booklist = new ArrayList<>();
		try {
			Connection connection = DbConnection.openConnection();
			PreparedStatement statement = connection.prepareStatement(Queries.querybycategory);

			// booklist=new ArrayList<>();
			statement.setString(1, category);
			statement.execute();
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				String title = rs.getString("title");
				String author = rs.getString("author");
				String category2 = rs.getString("category");
				int bookid = rs.getInt("bookid");
				double price = rs.getDouble("price");
				Book book = new Book(title, author, category2, bookid, price);
				booklist.add(book);

			}
			// return booklist;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return booklist;
	}

	@Override
	public List<Book> findByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> booklist = new ArrayList<>();
		try (Connection connection = DbConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.querybycategory);
				ResultSet rs = statement.executeQuery()) {
			// booklist=new ArrayList<>();
			statement.setDouble(1, price);
			;
			while (rs.next()) {
				String title = rs.getString("title");
				String author = rs.getString("author");
				String category2 = rs.getString("category");
				int bookid = rs.getInt("bookid");
				double price2 = rs.getDouble("price");
				Book book = new Book(title, author, category2, bookid, price2);
				booklist.add(book);

			}
			// return booklist;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return booklist;
	}

	@Override
	public List<Book> findByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> booklist = new ArrayList<>();
		try {
			Connection connection = DbConnection.openConnection();
			PreparedStatement statement = connection.prepareStatement(Queries.querybyauthorandcategory);
			// booklist=new ArrayList<>();
			statement.setString(1, author);
			statement.setString(2, category);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				String title = rs.getString("title");
				String author1 = rs.getString("author");
				String category2 = rs.getString("category");
				int bookid = rs.getInt("bookid");
				double price = rs.getDouble("price");
				Book book = new Book(title, author1, category2, bookid, price);
				booklist.add(book);

			}
			// return booklist;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return booklist;
	}

	@Override
	public Book findById(int bookId) throws BookNotFoundException {
		Book book=new Book();
		try(Connection connection=DbConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.querybyid);){
				statement.setInt(1,bookId);
				ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				String title=rs.getString("title");
				String author=rs.getString("author");
				String category2=rs.getString("category");
				int bookid=rs.getInt("bookid");
				double price=rs.getDouble("price");
				book=new Book(title,author,category2,bookid,price);
				//booklist.add(book);
				
			}
			//return booklist;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book ;
	}

	@Override
	public List<Book> findByDatePublished(int year) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
