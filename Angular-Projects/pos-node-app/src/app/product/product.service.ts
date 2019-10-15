import { Injectable } from '@angular/core';
import { Http, Headers, Response, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import { siteMap } from '../common/sitemap';

@Injectable()
export class ProductService {

  constructor(private http: Http) { }

  getAllProduct(): Observable<any> {
    let options = this.setHeaderAuthorization();
    const { PRODUCT_URL } = siteMap().product;

    return this.http.get(PRODUCT_URL, options)
      .map(response => response.json())
      .catch(this.handleError);
  }
  private handleError(response: Response): Observable<any> {
    const errorMessage = `${response.status} - ${response.statusText}`;
    return Observable.throw(errorMessage);
  }
  setHeaderAuthorization() {
    let token = sessionStorage.getItem('token');
    const headers = new Headers();
    headers.append('XSRF-TOKEN', JSON.parse(token));
    headers.append('Content-Type', 'application/json');
    headers.append('authorization', JSON.parse(token));
    return new RequestOptions({ headers: headers });
  }
}
