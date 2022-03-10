package service;

import java.util.List;

import dao.BookDao;
import dao.BookDaoImpl;
import dao.BookJdbcDaoImpl;
import pojo.BookPojo;

public class BookServiceImpl implements BookService{

	BookDao bookDao;
	

	public BookServiceImpl() {
		bookDao= new BookJdbcDaoImpl();
	}

	@Override
	public List<BookPojo> fetchAllBooks() {
		// TODO Auto-generated method stub
		return bookDao.fetchAllBooks();
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) {
		// TODO Auto-generated method stub
		return bookDao.addBook(bookPojo);
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo) {
		// TODO Auto-generated method stub
		return bookDao.updateBook(bookPojo);
	}

	@Override
	public BookPojo deleteBook(int bookId) {
		// TODO Auto-generated method stub
		return bookDao.deleteBook(bookId);
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		// TODO Auto-generated method stub
		return bookDao.fetchABook(bookId);
	}

}
