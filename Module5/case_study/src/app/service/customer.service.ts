import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Customer} from "../model/customer";

const URL_API: string ="http://localhost:3000/customers";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<Customer[]>{
    return this.httpClient.get<Customer[]>(URL_API);
  }

  findById(id: number): Observable<Customer>{
    return this.httpClient.get<Customer>(URL_API + "/" + id);
  }

  addCustomer(customer: Customer): Observable<void>{
    return this.httpClient.post<void>(URL_API, customer);
  }

  updateCustomer(id: number, customer:Customer): Observable<void>{
    return this.httpClient.patch<void>(URL_API + "/" + id, customer);
  }

  deleteCustomer(id: number): Observable<void>{
    return this.httpClient.delete<void>(URL_API + "/" + id);
  }
}
