import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { CanActivate } from '@angular/router';

@Injectable()
export class AuthGuard implements CanActivate {
    public token: string;
    loggedIn = false;
    constructor(private router: Router) { }

    canActivate() {
        const token = sessionStorage.getItem('token');
        if (token) {
            this.loggedIn = true;
            return true;
        } else {
            this.loggedIn = false;
            this.router.navigate(['login']);
            return false;
        }
    }
}
