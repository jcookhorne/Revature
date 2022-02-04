package presentation;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import pojo.BookPojo;
import service.BookService;
import service.BookServiceImpl;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		BookService bookService = new BookServiceImpl();
		char ch = 'y';
		while(ch =='y') {
		System.out.println("********************************************");
		System.out.println("\tBook Management System");
		System.out.println("**********************************************");
		System.out.println("1. Add a Book");
		System.out.println("2. Update a Book");
		System.out.println("3. remove a Book");
		System.out.println("4. Fetch all books");
		System.out.println("5. Exit");
		System.out.println("************************************************");
		System.out.println("Please enter menu option : ");
		int option = scan.nextInt();
		System.out.println("*************************************************");
		
		
		switch(option) {
		
		case 1:
			BookPojo newBook = new BookPojo();
			System.out.println("Enter Book Title");
			newBook.setBookTitle(scan.nextLine());
			System.out.println("Enter Book Author");
			newBook.setBookAuthor(scan.nextLine());
			System.out.println("Enter Book genre");
			newBook.setBookGenre(scan.nextLine());
			System.out.println("Enter Book cost");
			newBook.setBookCost(scan.nextInt());
			scan.next();
		case 2:
			
		case 3:
		
		case 4:
			List<BookPojo> allBooks = bookService.fetchAllBooks();
			Iterator<BookPojo> itr = allBooks.iterator();
			
			while(itr.hasNext()) {
				BookPojo book = itr.next();
				System.out.println(book.getBookId() + "\t" + book.getBookTitle() + "\t" + book.getBookAuthor() +"\t" + book.getBookGenre() + "\t" + book.getBookCost() + "\t" + book.getBookImageUrl());	
			}
			break;
		case 5:
			System.exit(0);
		
		}
		System.out.println("Do you wanna continue!!");
		ch = scan.next().charAt(0);

	}
	}
}
