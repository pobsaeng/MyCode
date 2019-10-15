import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from './login.service';
import { ToastComponent } from '../shared/toast/toast.component';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username: string;
  password: string;
  isLogging = false;

  constructor(
    private loginService: LoginService,
    private router: Router,
    private toast: ToastComponent) { }

  ngOnInit() {

  }

  enterLogin(event) {
    // enter login
    if (event.keyCode === 13) {
      this.doLogin();
    }
  }
  doLogin() {
    this.isLogging = true;
    this.loginService.doLogin(this.username, this.password).then((result: any) => {
      if (result.success) {
        localStorage.setItem('token', JSON.stringify(result.token));
        sessionStorage.setItem('token', JSON.stringify(result.token));

        this.isLogging = false;
        this.router.navigate(['categories']);

      } else {
        this.isLogging = false;
        this.router.navigate(['']);

        this.toast.setMessage('Username or Password invalid', 'danger');
        return;
      }
    })
      .catch((error) => {
        this.isLogging = false;
        alert(JSON.stringify(error));
      });
  }
}
