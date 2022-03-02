import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-display',
  templateUrl: './display.component.html',
  styleUrls: ['./display.component.css']
})
export class DisplayComponent implements OnInit {

  toggle = true;
  movieName = "";
  constructor() { }

  ngOnInit(): void {
  }

  showName(){
    if (this.toggle){
      this.movieName = "Social Network";
      this.toggle = false;
  
    }else{
      this.movieName="";
      this.toggle =true;
    }
}



}
