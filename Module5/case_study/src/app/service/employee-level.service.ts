import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {EmployeeLevel} from "../model/employee-level";

const URL_API: string = "http://localhost:3000/employeeLevels";

@Injectable({
  providedIn: 'root'
})
export class EmployeeLevelService {

  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<EmployeeLevel[]>{
    return this.httpClient.get<EmployeeLevel[]>(URL_API);
  }
}
