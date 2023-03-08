import { Component, OnInit } from '@angular/core';
import {Parent} from "../../model/parent";
import {ParentService} from "../../service/parent.service";

@Component({
  selector: 'app-parent-list',
  templateUrl: './parent-list.component.html',
  styleUrls: ['./parent-list.component.css']
})
export class ParentListComponent implements OnInit {

  parents: Parent[] = [];
  page: string | number = 0;

  constructor(
    private parentService: ParentService
  ) { }

  ngOnInit(): void {
    this.getAll()
  }

  getAll(){
    this.parentService.getAll().subscribe(next=>{
      this.parents = next;
    }, error => {
      console.log(error);
    })
  }

  getDelete(id: number) {
    this.parentService.deleteParent(id).subscribe(next=>{
      this.getAll();
    })
  }
}
