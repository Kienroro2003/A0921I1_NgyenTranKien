import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {EmployeeLevel} from "../model/employee-level";
import {EmployeePosition} from "../model/employee-position";
import {EmployeeDepartment} from "../model/employee-department";

const URL_API: string = "http://localhost:3000/employeeDepartments";

@Injectable({
  providedIn: 'root'
})
export class EmployeeDepartmentService {

  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<EmployeeDepartment[]>{
    return this.httpClient.get<EmployeeDepartment[]>(URL_API);
  }
}
