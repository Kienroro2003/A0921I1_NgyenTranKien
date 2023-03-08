import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Child} from "../model/child";

const URL_API = "http://localhost:3000/children";

@Injectable({
  providedIn: 'root'
})
export class ChildService {

  constructor(
    private httpClient: HttpClient
  ) { }

  getAll(): Observable<Child[]>{
    return this.httpClient.get<Child[]>(URL_API);
  }
}
