import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Position} from "../model/position";
import {Division} from "../model/division";

@Injectable({
  providedIn: 'root'
})
export class DivisionService {
  private URL: string;

  constructor(private httpClient: HttpClient) {
    this.URL = "http://localhost:8080/division";
  }

  getAll(): Observable<Division[]> {
    return this.httpClient.get<Division[]>(this.URL + "/list");
  }
}
