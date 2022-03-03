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
import { AuthGuard } from './user/auth.guard';

const routes: Routes = [
  { path: "display", component: DisplayComponent, canActivate: [AuthGuard]},
  { path: "copy", component: CopyComponent, canActivate: [AuthGuard] },
  { path: "counter", component: CounterComponent, canActivate: [AuthGuard] },
  { path: "list-fruit", component: ListFruitComponent, canActivate: [AuthGuard] },
  { path: "book-crud", component: ListBookComponent, canActivate: [AuthGuard] },
  { path: "edit-book/:myId", component: EditBookComponent, canActivate: [AuthGuard] },
  {path: "login", component: LoginComponent },
  {path: "logout", component: LogoutComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
