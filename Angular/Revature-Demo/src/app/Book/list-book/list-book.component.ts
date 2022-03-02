import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Book } from '../book.model';
import { BookService } from '../book.service';


@Component({
  selector: 'app-list-book',
  templateUrl: './list-book.component.html',
  styleUrls: ['./list-book.component.css']
})
export class ListBookComponent implements OnInit {

  allBooks: Book[] = [];
  toggleAdd: boolean = false;

  newBook: Book = {
    bookId: 0,
    bookTitle: "",
    bookAuthor: "",
    bookGenre: "",
    bookCost: 0,
    bookImageUrl: ""
  }
  //commenting this line because we can use private in front of the parameter
  //bookService: BookService;

  // Dependency Injection (DI)
  constructor(private bookService: BookService, private router:Router) {
    //commenting this line because we can use private in front of the parameter
    //this.bookService = bookService;

    // commented out because we pass bookService as a parameter to the constructor(DI)
    //this.bookService = new BookService();
   }
  
  ngOnInit(): void {
    this.allBooks = this.bookService.fetchAllBooks();
  }

  toggleAddForm(){
    if(this.toggleAdd){
      this.toggleAdd = false;
    }else{
      this.toggleAdd = true;
    }
  }

  goToEditBook(bookId: number){
    // here we have to route to EditBookComponent whose route path is edit-book
    // to use this.router.navigate(), inject Router in the constructor
    this.router.navigate(['edit-book', bookId]);
  }

  deleteBook(bookId: number){
   this.allBooks = this.bookService.deleteBook(bookId);
  }

  addBook(){
    // doing this because am working with arrays, otherwise not required
    let addNewBook: Book = {
      bookId: 0,
      bookTitle: this.newBook.bookTitle,
      bookAuthor:this.newBook.bookAuthor,
      bookGenre: this.newBook.bookGenre,
      bookCost: this.newBook.bookCost,
      bookImageUrl: this.newBook.bookImageUrl
    }

    this.bookService.addBook(addNewBook);
    this.allBooks = this.bookService.fetchAllBooks();
  }
}