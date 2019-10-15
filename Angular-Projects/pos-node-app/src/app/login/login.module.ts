import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { ToastComponent } from '../shared/toast/toast.component';
import { LoginRoutesModule } from './login-routes.module';
import { LoginService } from './login.service';

@NgModule({
  imports: [
    HttpModule,
    FormsModule,
    ReactiveFormsModule,
    CommonModule,
    LoginRoutesModule, //routing module

  ],
  providers: [
    LoginService,
    ToastComponent
  ],
  exports: [LoginRoutesModule],
  declarations: [
    LoginComponent,
    ToastComponent
  ] //login component
})
export class LoginModule { }
