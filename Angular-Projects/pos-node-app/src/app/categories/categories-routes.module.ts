import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CategoriesComponent } from './categories.component';
import { AuthGuard } from '../baseapp/auth-guard.service';

const routes: Routes = [{ path: 'categories', component: CategoriesComponent }];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, {
      useHash: true
    }),
  ],
  exports: [RouterModule]
})
export class CategoriesRoutesModule { }
