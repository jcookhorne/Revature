package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import pojo.BookPojo;

public class BookDaoImpl implements BookDao {

	List<BookPojo> allBooks;

	public BookDaoImpl() {
		allBooks = new ArrayList<BookPojo>();
		// BookPojo book1 = new BookPojo(101, "Star Wars", "George Lucas", "Science
		// Fiction", 17,"" );
		allBooks.add(new BookPojo(101, "Star Wars phantom menace", "George Lucas", "Science Fiction", 17, ""));
		allBooks.add(new BookPojo(102, "Star Wars a new hope", "George Lucas", "Science Fiction", 12, ""));
		allBooks.add(new BookPojo(103, "Star Wars return of the jedi", "George Lucas", "Science Fiction", 14, ""));

	}

	@Override
	public List<BookPojo> fetchAllBooks() {
		return allBooks;
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) {
		// TODO Auto-generated method stub
		int newBookId = allBooks.get(allBooks.size() - 1).getBookId() + 1;
		bookPojo.setBookId(newBookId);
		allBooks.add(bookPojo);
		return bookPojo;
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo) {
		// TODO Auto-generated method stub
		for (int i = 0; i < allBooks.size(); i++) {
			if (allBooks.get(i).getBookId() == bookPojo.getBookId()) {
				allBooks.set(i, bookPojo);
				allBooks.remove(i);
			}
		}
		return bookPojo;
	}

	@Override
	public BookPojo deleteBook(int bookId) {
		// TODO Auto-generated method stub
		BookPojo returnBookPojo = null;
		for (int i = 0; i < allBooks.size(); i++) {
			if (allBooks.get(i).getBookId() == bookId) {
				returnBookPojo = allBooks.get(i);
				allBooks.remove(i);
			}
		}
		return returnBookPojo;
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		// TODO Auto-generated method stub
		BookPojo returnBookPojo = null;

		// iterrating an ArrayList using for loop
//		for (int i = 0; i < allBooks.size(); i++) {
//			if (allBooks.get(i).getBookId() == bookId) {
//				returnBookPojo = allBooks.get(i);
//			}    }

		// iterrating an ArayList using Iterator

		Iterator<BookPojo> itr = allBooks.iterator();
		while (itr.hasNext()) {
			BookPojo book = (BookPojo) itr.next();
			if (book.getBookId() == bookId) {
				returnBookPojo = book;
			}
		}
		// iterating an ArrayList using enhanced for loop
		for (BookPojo book : allBooks) {
			if(book.getBookId() == bookId) {
				returnBookPojo = book;
				break;
			}
		}
		
		// iterating an ArtrayList using a for loop
		//removeIf interal iterator
		List<BookPojo> allReturnBook = new ArrayList<BookPojo>(allBooks);
		allReturnBook.removeIf((book) -> book.getBookId() != bookId);
		if (allReturnBook.size() ==1) {
			returnBookPojo = allReturnBook.get(0);
		}
		return returnBookPojo;
		
		

	}

}
