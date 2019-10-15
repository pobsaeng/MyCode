import { BrowserModule } from '@angular/platform-browser';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';

import { AuthGuard } from './auth-guard.service';

import { LoginModule } from '../login/login.module';
import { CategoriesModule } from '../categories/categories.module';
import { AppRoutesModule } from './app-routes.module';
import { ProductModule } from '../product/product.module';
import { GroupproductModule } from '../groupproduct/groupproduct.module';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    // NgbModule,
    BrowserModule,
    AppRoutesModule,
    LoginModule,
    CategoriesModule,
    ProductModule,
    GroupproductModule
  ],
  exports: [RouterModule],
  providers: [
    AuthGuard
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
