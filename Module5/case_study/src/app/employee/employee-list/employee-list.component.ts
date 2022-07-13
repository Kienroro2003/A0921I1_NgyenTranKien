import {Component, OnInit} from '@angular/core';
import {EmployeePosition} from "../../model/employee-position";
import {EmployeeLevel} from "../../model/employee-level";
import {EmployeeDepartment} from "../../model/employee-department";
import {EmployeePositionService} from "../../service/employee-position.service";
import {EmployeeLevelService} from "../../service/employee-level.service";
import {EmployeeDepartmentService} from "../../service/employee-department.service";
import {EmployeeService} from "../../service/employee.service";
import {Employee} from "../../model/employee";
import {Router} from "@angular/router";

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employees: Employee[] = [];

  name:string = "";

  email:string ="";


  constructor(
    private employeeService: EmployeeService,
    private router: Router
  ) {
  }

  getAll() {
    this.employeeService.getAll().subscribe(next => {
      console.log(next)
      this.employees = next;
    })
  }


  ngOnInit(): void {
    this.getAll();
  }


  onDelete(id: number) {
    this.employeeService.deleteEmployee(id).subscribe(() => {
      this.getAll();
    });
  }

  // searchName(name: string){
  //   this.employeeService.findByName(name).subscribe(next=>{
  //     console.log(next);
  //   })
  // }
  p: string | number = 0;

  search() {
    // this.employeeService.findByName("").subscribe(next=>{
    //   console.log(next);
    //   // this.employees = next;
    // })
    this.employeeService.searchPlural(this.name, this.email).subscribe(next=>{
      this.employees = next;
    })
  }
}
