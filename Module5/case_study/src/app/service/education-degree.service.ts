import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Position} from "../model/position";
import {EducationDegree} from "../model/education-degree";

@Injectable({
  providedIn: 'root'
})
export class EducationDegreeService {
  private URL: string;

  constructor(private httpClient: HttpClient) {
    this.URL = "http://localhost:8080/education_degree";
  }

  getAll(): Observable<EducationDegree[]> {
    return this.httpClient.get<EducationDegree[]>(this.URL + "/list");
  }
}
