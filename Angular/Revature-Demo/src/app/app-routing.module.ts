import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DisplayComponent } from './display/display.component';
import { CopyComponent } from './copy/copy.component';
import { CounterComponent } from './counter/counter.component';
import { ListFruitComponent } from './list-fruit/list-fruit.component';
import { ListBookComponent } from './Book/list-book/list-book.component';
import { EditBookComponent } from './Book/edit-book/edit-book.component';
import { LoginComponent } from './user/login/login.component';
import { LogoutComponent } from './user/logout/logout.component';

const routes: Routes = [
  { path: "display", component: DisplayComponent },
  { path: "copy", component: CopyComponent },
  { path: "counter", component: CounterComponent },
  { path: "list-fruit", component: ListFruitComponent },
  { path: "list-book", component: ListBookComponent },
  {path: "edit-book/:myId", component: EditBookComponent },
  {path: "login", component: LoginComponent },
  {path: "logout", component: LogoutComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
