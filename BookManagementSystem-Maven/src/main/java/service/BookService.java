package service;

import java.util.List;

import pojo.BookPojo;

public interface BookService {
	// Read - fetch all books
	List<BookPojo> fetchAllBooks();

	// Create
	BookPojo addBook(BookPojo bookPojo);

	// Update
	BookPojo updateBook(BookPojo bookPojo);

	// Delete
	BookPojo deleteBook(int bookId);

	// Read - fetch a book
	BookPojo fetchABook(int bookId);

}
