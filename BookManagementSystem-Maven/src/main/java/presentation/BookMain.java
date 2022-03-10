package presentation;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import pojo.BookPojo;
import service.BookService;
import service.BookServiceImpl;

public class BookMain {

public static void main(String[] args) {
		
		BookService bookService = new BookServiceImpl();
		Scanner scan = new Scanner(System.in);
		char ch = 'y';
		while(ch == 'y') {
		
			System.out.println("*************************************");
			System.out.println("\tBook Management System");
			System.out.println("*************************************");
			System.out.println("1. Add a Book");
			System.out.println("2. Update a Book");
			System.out.println("3. Remove a Book");
			System.out.println("4. Fetch all Books");
			System.out.println("5. Exit");
			System.out.println("*************************************");
			System.out.println("Please enter menu option : ");
			int option = scan.nextInt();
			scan.nextLine();
			System.out.println("*************************************");
			
			switch(option) {
				case 1:
					BookPojo newBook = new BookPojo();
					System.out.println("Enter Book Title :");
					newBook.setBookTitle(scan.nextLine());
					System.out.println("Enter Book Author :");
					newBook.setBookAuthor(scan.nextLine());
					System.out.println("Enter Book Genre :");
					newBook.setBookGenre(scan.nextLine());
					System.out.println("Enter Book Cost :");
					newBook.setBookCost(scan.nextInt());
					
					BookPojo addedBook = bookService.addBook(newBook);
					System.out.println("Book Added Successfully!!\nYour new Book ID is " + addedBook.getBookId());
					
					break;
				case 2:
					System.out.println("Enter the book id that you want to update: ");
					int updateBookId = scan.nextInt();
					BookPojo fetchedOldBook = bookService.fetchABook(updateBookId);
					if(fetchedOldBook == null) {
						System.out.println("Please enter a valid book ID!");
						break;
					}
					System.out.println("***************************************");
					System.out.println("Book ID : " +  fetchedOldBook.getBookId());
					System.out.println("Book Title : " +  fetchedOldBook.getBookTitle());
					System.out.println("Book Author : " +  fetchedOldBook.getBookAuthor());
					System.out.println("Book Genre : " +  fetchedOldBook.getBookGenre());
					System.out.println("Book Cost : " +  fetchedOldBook.getBookCost());
					System.out.println("***************************************");
					System.out.println("Please enter the new book cost: ");
					fetchedOldBook.setBookCost(scan.nextInt());
					bookService.updateBook(fetchedOldBook);
					System.out.println("Book Updated Successfully!!");
					break;
				case 3:
					System.out.println("Enter the book id that you want to delete : ");
					int bookId = scan.nextInt();
					BookPojo fetchedBook = bookService.fetchABook(bookId);
					if(fetchedBook == null) {
						System.out.println("Please enter a valid book ID!");
						break;
					}
					System.out.println("***************************************");
					System.out.println("Book ID : " +  fetchedBook.getBookId());
					System.out.println("Book Title : " +  fetchedBook.getBookTitle());
					System.out.println("Book Author : " +  fetchedBook.getBookAuthor());
					System.out.println("Book Genre : " +  fetchedBook.getBookGenre());
					System.out.println("Book Cost : " +  fetchedBook.getBookCost());
					System.out.println("***************************************");
					System.out.println("Are to sure you want to remove this book?(y/n)");
					char deleteOption = scan.next().charAt(0);
					System.out.println("***************************************");
					if(deleteOption == 'y') {
						bookService.deleteBook(bookId);
						System.out.println("Book Removed Successfully!!");
					}
					
					break;
				case 4:
					List<BookPojo> allBooks = bookService.fetchAllBooks();
					Iterator<BookPojo> itr = allBooks.iterator();
					System.out.println("**************************************************************************************");
					System.out.println("ID\tTITLE\t\t\t\t\tAUTHOR\t\tGENRE\tCOST");
					System.out.println("**************************************************************************************");
					while(itr.hasNext()) {
						BookPojo book = itr.next();
						System.out.println(book.getBookId() + "\t" + book.getBookTitle() + "\t\t\t" + book.getBookAuthor() + "\t" + book.getBookGenre() + "\t" + book.getBookCost());
					}
					System.out.println("**************************************************************************************");
					break;
				case 5:
					System.out.println("************************************");
					System.out.println("Exiting System....");
					System.out.println("Thankyou for using Book Management System");
					System.out.println("************************************");
	
					System.exit(0);
			}
			System.out.println("Do you want to continue(y/n) : ");
			ch = scan.next().charAt(0);
			scan.nextLine();
		}
				
		System.out.println("*****************************************");
		System.out.println("Exiting System....");
		System.out.println("Thankyou for using Book Management System");
		System.out.println("*****************************************");

	}

}