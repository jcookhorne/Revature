package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojo.BookPojo;

public class BookJdbcDaoImpl implements BookDao {
// load that driver( do it only once)
	
// establish a connection to a database ( do it only once )
	
	// handling exceptions and executing statements happens in every methods


	@Override
	public List<BookPojo> fetchAllBooks() {
		Connection conn = DbUtil.obtainConnection();
	
		//create an array list to hold all the book info fetched from the DB
		List<BookPojo> allBooks = new ArrayList<BookPojo>();
		try {
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM book";
			ResultSet rs = stmt.executeQuery(query);
			//iterates through the result set
			if(rs.next()) {	
				BookPojo bookPojo = new BookPojo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6));
				allBooks.add(bookPojo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allBooks;
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) {
		// TODO Auto-generated method stub
		Connection conn = DbUtil.obtainConnection();
		try {
			Statement stmt = conn.createStatement();
			int lastBookId = 0;
			String query1 = "SELECT MAX(book_id) FROM book";// sub query with nested SELECT
		ResultSet rs = stmt.executeQuery(query1);
		if(rs.next()) {
			lastBookId = rs.getInt(1);
		}
		int newBookId = lastBookId + 1;
			String query = "INSERT INTO book VALUES( "+newBookId+",'"+bookPojo.getBookTitle()+"','"+bookPojo.getBookAuthor()+"','"+bookPojo.getBookGenre()+"',"+bookPojo.getBookCost()+",'"+bookPojo.getBookImageUrl()+"')";
		
			int rows = stmt.executeUpdate(query);
			bookPojo.setBookId(newBookId);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bookPojo;
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo) {
		Connection conn = DbUtil.obtainConnection();
		try {
			Statement stmt = conn.createStatement();
			String query = "UPDATE book SET book_cost="+bookPojo.getBookCost();
		}catch(SQLException e) {
			
		}
		return null;
	}

	@Override
	public BookPojo deleteBook(int bookId) {
		Connection conn = DbUtil.obtainConnection();
		try {
			Statement stmt = conn.createStatement();
			String query = "DELETE FROM book WHERE book_id=" + bookId;
			int rows = stmt.executeUpdate(query);
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
			
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		// TODO Auto-generated method stub
		Connection conn = DbUtil.obtainConnection();
		BookPojo bookPojo = null;
		try {
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM book WHERE book_id="+bookId;
			ResultSet rs = stmt.executeQuery(query);
			
			if(rs.next()) {
				bookPojo = new BookPojo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return bookPojo;
	}

}
