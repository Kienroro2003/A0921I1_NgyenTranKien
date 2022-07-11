import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Todo} from "../todo";



@Injectable({
  providedIn: 'root'
})
export class TodoServiceService {


  constructor(private httpClient: HttpClient) { }

  getAll():Observable<Todo[]>{
    return this.httpClient.get<Todo[]>("http://localhost:3000/todos");
  }

  addTodo(todo: Todo):Observable<void>{
    console.log(todo);
    return this.httpClient.post<void>("http://localhost:3000/todos", todo);
  }
}
