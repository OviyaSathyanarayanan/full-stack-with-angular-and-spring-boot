import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, map } from 'rxjs';
import { Product } from '../common/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private baseUrl: string = 'http://localhost:8080/api/v1/products';

  constructor(public httpClient: HttpClient) { }

  getProductList(): Observable<Product[]> {
    // for spring data rest
    /*return this.httpClient.get<GetResponse>(this.baseUrl).pipe(
      map(response => response._embedded.products)
    );*/

    // for rest controller
    return this.httpClient.get<Product[]>(this.baseUrl);
  }  

}

interface GetResponse {
  _embedded: {
    products: Product[];
  }
}


