import { Component, OnInit } from '@angular/core';
import { Todo } from './todo';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {

  public todos: Array<Todo>;
  public tarea: string;

  constructor() { }

  ngOnInit() {
  }

  addTodo() {
    const nuevoTodo = new Todo(this.tarea);
    this.todos.push(nuevoTodo);
  }

}
