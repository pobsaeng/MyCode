import { Injectable, Inject } from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';

import { siteMap } from '../common/sitemap';

@Injectable()
export class LoginService {
    constructor(private http: Http) {
    }

    doLogin(username: string, password: string) {
        const { LOGIN_URL } = siteMap().login;

        return new Promise((resolve, reject) => {
            this.http.post(LOGIN_URL, { username: username, password: password })
                .map(res => res.json()).subscribe(data => {
                    resolve(data);
                }, error => {
                    reject(error);
                });
        });
    }
}
