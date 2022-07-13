import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {Employee} from "../model/employee";
import {HttpClient} from "@angular/common/http";

const URL_API: string = "http://localhost:3000/employees";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(URL_API);
  }

  findById(id: number): Observable<Employee>{
    return this.httpClient.get<Employee>(URL_API + "/" + id);
  }

  addEmployee(customer: Employee): Observable<void>{
    return this.httpClient.post<void>(URL_API, customer);
  }

  updateEmployee(id: number, customer:Employee): Observable<void>{
    return this.httpClient.patch<void>(URL_API + "/" + id, customer);
  }

  deleteEmployee(id: number): Observable<void>{
    return this.httpClient.delete<void>(URL_API + "/" + id);
  }

  // sortField(field: number | string): Observable<void>{
  //   return this.httpClient.get<void>(URL_API + "?_sort="+ field + "&_order=desc");
  // }
  //
  findByName(name: string): Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(URL_API + "?nameEmployee_like="+name);
  }

  searchPlural(name: string, email: string):Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(URL_API + "?nameEmployee_like="+ name +"&email_like="+email);
  }
}
