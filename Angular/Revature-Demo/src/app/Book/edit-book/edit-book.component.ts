import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Book } from '../book.model';
import { BookService } from '../book.service';






@Component({
  selector: 'app-edit-book',
  templateUrl: './edit-book.component.html',
  styleUrls: ['./edit-book.component.css']
})
export class EditBookComponent implements OnInit {
 
  toggleUpdate: boolean = false;
  newBook: Book = {
    bookId: 0,
    bookTitle: "",
    bookAuthor: "",
    bookGenre: "",
    bookCost: 0,
    bookImageUrl: ""
  }
  
  constructor(private activatedRoute: ActivatedRoute, private bookService:BookService, private router: Router) { }
  // to take out the route parameter, we need ot inject activated route in the constructor

 
  ngOnInit(): void {
    // to take out the route parameter, we need to inject ActivatedRoute in the constructor
    let bookId: any = this.activatedRoute.snapshot.paramMap.get("myId");
    console.log(bookId);
    // fetch the book with the bookId from the service layer
    this.newBook = this.bookService.fetchABook(bookId);

  }

  test(myTitle: any){
    console.log(myTitle);
  }
  updateBook(){
    this.bookService.updateBook(this.newBook);
    // once update is over navigate back to ListBookComponent
    this.router.navigate(['book-crud']);
  }

  
}
