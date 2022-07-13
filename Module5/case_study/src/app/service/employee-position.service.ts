import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {EmployeeLevel} from "../model/employee-level";
import {Employee} from "../model/employee";
import {EmployeePosition} from "../model/employee-position";

const URL_API: string = "http://localhost:3000/employeePositions";

@Injectable({
  providedIn: 'root'
})
export class EmployeePositionService {

  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<EmployeePosition[]>{
    return this.httpClient.get<EmployeePosition[]>(URL_API);
  }
}
