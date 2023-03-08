import { Component, OnInit } from '@angular/core';
import {Child} from "../model/child";

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  compareFn(o1: Child, o2: Child){
    return o1 && o2 ? o1.id === o2.id : o1 === o2;
  }

}
