import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DisplayComponent } from './display/display.component';
import { HeaderComponent } from './header/header.component';
import { CopyComponent } from './copy/copy.component';
import { CounterComponent } from './counter/counter.component';
import { FormsModule } from '@angular/forms';
import { ListFruitComponent } from './list-fruit/list-fruit.component';
import { ListBookComponent } from './Book/list-book/list-book.component';
import { EditBookComponent } from './Book/edit-book/edit-book.component';
import { LoginComponent } from './user/login/login.component';
import { LogoutComponent } from './user/logout/logout.component'


@NgModule({
  declarations: [
    AppComponent,
    DisplayComponent,
    HeaderComponent,
    CopyComponent,
    CounterComponent,
    ListFruitComponent,
    ListBookComponent,
    EditBookComponent,
    LoginComponent,
    LogoutComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
