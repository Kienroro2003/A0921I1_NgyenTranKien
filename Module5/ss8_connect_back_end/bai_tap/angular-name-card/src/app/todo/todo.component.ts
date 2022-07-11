import {Component, OnInit} from '@angular/core';
import {Todo} from '../todo';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {TodoServiceService} from "../service/todo-service.service";

let _id = 1;

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {
  todos: Todo[] = [];
  content = new FormControl();

  constructor(private todoService: TodoServiceService) {
  }

  ngOnInit() {
    this.getAll();
  }

  getAll(){
    this.todoService.getAll().subscribe(text=>{
      console.log(text);
      this.todos = text;
    })
  }

  toggleTodo(i: number) {
    this.todos[i].complete = !this.todos[i].complete;
  }

  change() {
    const value = this.content.value;
    if (value) {
      const todo: Todo = {
        id: _id++,
        content: value,
        complete: false
      };
      // this.todos.push(todo);
      this.todoService.addTodo(todo).subscribe(text=>{
        this.getAll();
      })
      this.content.reset();
    }
  }
}
