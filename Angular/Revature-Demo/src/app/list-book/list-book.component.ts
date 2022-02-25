import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-book',
  templateUrl: './list-book.component.html',
  styleUrls: ['./list-book.component.css']
})
export class ListBookComponent implements OnInit {

  constructor() { }
  oneBook = {
    bookId: 101,
    bookTitle: "Harry Potter and the Order of Phoenix",
    bookAuthor: "J.K.Rowling",
    bookGenre: "Fiction",
    bookCost: 45,
    bookImageUrl: "https://images.unsplash.com/photo-1611676279444-5577698aa13c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1074&q=80"
  };

  allBooks = [
    {
      bookId: 101,
      bookTitle: "Harry Potter and the Order of Phoenix",
      bookAuthor: "J.K.Rowling",
      bookGenre: "Fiction",
      bookCost: 45,
      bookImageUrl: "https://images.unsplash.com/photo-1611676279444-5577698aa13c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1074&q=80"
    },
    {
      bookId: 102,
      bookTitle: "Harry Potter and the Sorceres Stone",
      bookAuthor: "J.K.Rowling",
      bookGenre: "Fiction",
      bookCost: 100,
      bookImageUrl: "https://images.unsplash.com/photo-1610466025839-ec6040c347b6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80"
    },
    {
      bookId: 103,
      bookTitle: "Harry Potter and the Order of Phoenix",
      bookAuthor: "J.K.Rowling",
      bookGenre: "Fiction",
      bookCost: 145,
      bookImageUrl: "https://images.unsplash.com/photo-1626618012641-bfbca5a31239?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=464&q=80"
    }
  ];
  ngOnInit(): void {
  }

}
