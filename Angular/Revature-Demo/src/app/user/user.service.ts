import { Injectable } from '@angular/core';
import { AuthService } from './auth.service';
import { User } from './user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private authService:AuthService) { }


validateUser(newUser: User): User{
    if(newUser.role == "admin" && newUser.userName=="admin" && newUser.password == "admin"){
      // user has successfully logged in as an admin
      // 1. store user information in the browser storage
      this.authService.storeUser(newUser);
      // 2. mark that we have logged in 
      this.authService.loggedin=true;

    }else if(newUser.role == "customer" && newUser.userName=="customer" && newUser.password == "customer"){
        // user has successfully logged in as an admin
      // 1. store user information in the browser storage
      this.authService.storeUser(newUser);
      // 2. mark that we have logged in 
      this.authService.loggedin=true;
    }else{
      //invalid credentials
      newUser ={
        userName:"",
        password:"",
        role:""
      }
    } 
    return newUser;

}

}
