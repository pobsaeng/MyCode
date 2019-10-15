import { Injectable } from '@angular/core';
import { Http, Headers, Response, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import { siteMap } from '../common/sitemap';

@Injectable()
export class GroupproductService {

  constructor(private http: Http) { }

  create(groupproduct: any): Promise<any> {
    let options = this.setHeaderAuthorization();
    const { CRETAE_URL } = siteMap().groupproduct;

    return this.http
      .post(CRETAE_URL, JSON.stringify(groupproduct), options)
      .toPromise()
      .then(res => {
        console.log(res.json());
      })
      .catch(this.handleError);
  }
  searchLike(value: any): Observable<any> {
    let options = this.setHeaderAuthorization();
    const { SEARCH_LIKE_URL } = siteMap().groupproduct;

    return this.http.post(SEARCH_LIKE_URL, JSON.stringify(value), options)
      .map(response => response.json())
      .catch(this.handleError);
  }
  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error); // for demo purposes only
    return Promise.reject(error.message || error);
  }
  setHeaderAuthorization() {
    let token = sessionStorage.getItem('token');
    const headers = new Headers();
    // headers.append('XSRF-TOKEN', JSON.parse(token));
    headers.append('Content-Type', 'application/json');
    headers.append('authorization', JSON.parse(token));
    return new RequestOptions({ headers: headers });
  }
}
