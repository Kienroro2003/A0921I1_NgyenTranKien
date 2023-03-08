import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {Employee} from "../model/employee";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private URL_API: string;

  constructor(private httpClient: HttpClient) {
    this.URL_API = 'http://localhost:8080/employee';
  }

  getAll(): Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(this.URL_API + "/list");
  }

  findById(id: number): Observable<Employee>{
    return this.httpClient.get<Employee>(this.URL_API + "/" + id);
  }

  addEmployee(customer: Employee): Observable<void>{
    return this.httpClient.post<void>(this.URL_API + "/create", customer);
  }

  updateEmployee(id: number, customer:Employee): Observable<void>{
    return this.httpClient.patch<void>(this.URL_API + "/update?id=" + id, customer);
  }

  deleteEmployee(id: number): Observable<void>{
    return this.httpClient.delete<void>(this.URL_API + "/" + id);
  }

  // sortField(field: number | string): Observable<void>{
  //   return this.httpClient.get<void>(URL_API + "?_sort="+ field + "&_order=desc");
  // }
  //
  findByName(name: string): Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(this.URL_API + "?nameEmployee_like="+name);
  }

  searchPlural(name: string, email: string):Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(this.URL_API + "?nameEmployee_like="+ name +"&email_like="+email);
  }
}
