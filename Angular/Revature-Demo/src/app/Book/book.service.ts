import { Injectable } from '@angular/core';
import { Book } from './book.model';

@Injectable({
  providedIn: 'root'
})
@Injectable({
  providedIn: 'root'
})

export class BookService {

  

  allBooks: Book[] = [
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

  
  constructor() { }

  fetchAllBooks(): Book[]{
    return this.allBooks;
  }

  deleteBook(bookId: number): Book[]{
    console.log(bookId);
    for(let i=0; i<this.allBooks.length;i++){
      if(this.allBooks[i].bookId == bookId){
        this.allBooks.splice(i, 1);
        break;
      }
    }
    return this.allBooks;
  }

  addBook(bookModel: Book): Book{
    let newBookId: number = this.allBooks[this.allBooks.length-1].bookId + 1;
    bookModel.bookId = newBookId;
    this.allBooks.push(bookModel);
    return bookModel;
  }

  updateBook(bookModel: Book): Book{
    for(let i=0; i<this.allBooks.length;i++){
      if(this.allBooks[i].bookId == bookModel.bookId){
        this.allBooks[i] = bookModel;
        break;
      }
    }
    return bookModel;
  }

  fetchABook(bookId: number): Book{
    for(let i=0; i<this.allBooks.length;i++){
      if(this.allBooks[i].bookId == bookId){
        return this.allBooks[i];
      }
    }
    return {
      bookId: 0,
      bookTitle: "",
      bookAuthor: "",
      bookGenre: "",
      bookCost: 0,
      bookImageUrl: ""
      };
  }

}
