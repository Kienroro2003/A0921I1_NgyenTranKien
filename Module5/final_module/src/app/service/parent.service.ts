import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Parent} from "../model/parent";

const URL_API = "http://localhost:3000/parents";

@Injectable({
  providedIn: 'root'
})
export class ParentService {

  constructor(private httpClient: HttpClient) { }

  getAll():Observable<Parent[]>{
    return this.httpClient.get<Parent[]>(URL_API)
  }

  findById(id: number): Observable<Parent>{
    return this.httpClient.get<Parent>(URL_API + "/" + id)
  }

  addParent(parent: Parent):Observable<void>{
    return this.httpClient.post<void>(URL_API, parent)
  }

  updateParent(id: number, parent: Parent):Observable<void>{
    return this.httpClient.patch<void>(URL_API + "/" + id, parent)
  }

  deleteParent(id: number):Observable<void>{
    return this.httpClient.delete<void>(URL_API + "/" + id);
  }
}
