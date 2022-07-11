import {Injectable} from '@angular/core';
import {Product} from '../model/product';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  products: Product[] = [];

  constructor(private httpClient: HttpClient) {
  }

  getAll(): Observable<Product[]> {
    return this.httpClient.get<Product[]>('http://localhost:3000/products');
  }

  saveProduct(product: Product):Observable<void> {
    return this.httpClient.post<void>('http://localhost:3000/products',product);
  }

  findById(id: number):Observable<Product> {
    return this.httpClient.get<Product>('http://localhost:3000/products/' + id);
  }

  updateProduct(id: number, product: Product):Observable<void> {
    return this.httpClient.patch<void>('http://localhost:3000/products/' + id,product);
  }

  deleteProduct(id: number):Observable<void> {
    return this.httpClient.delete<void>('http://localhost:3000/products/' + id);
  }
}
