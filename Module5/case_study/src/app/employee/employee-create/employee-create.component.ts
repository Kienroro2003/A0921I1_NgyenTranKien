import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";

import {EmployeeService} from "../../service/employee.service";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Employee} from "../../model/employee";
import {gte} from "../../dto/gte.validator";
import {PositionService} from "../../service/position.service";
import {EducationDegree} from "../../model/education-degree";
import {EducationDegreeService} from "../../service/education-degree.service";
import {DivisionService} from "../../service/division.service";
import {Position} from "../../model/position";
import {Division} from "../../model/division";

@Component({
  selector: 'app-employee-create',
  templateUrl: './employee-create.component.html',
  styleUrls: ['./employee-create.component.css']
})
export class EmployeeCreateComponent implements OnInit {

  // @ts-ignore
  employeeGroup: FormGroup;

  positions: Position[] = [];

  educationDegrees: EducationDegree[] = [];

  divisions: Division[] = [];

  constructor(
    private positionService: PositionService,
    private educationDegreeService: EducationDegreeService,
    private divisionService: DivisionService,
    private employeeService: EmployeeService,
    private router: Router
  ) {
    this.employeeService.getAll().subscribe(next=>{
      this.employeeGroup = new FormGroup({
        id: new FormControl(next.length+1),
        employeeName: new FormControl("", [Validators.required, Validators.minLength(6)]),
        employeeBirthday: new FormControl("", [Validators.required, Validators.pattern("\\d{4}-\\d{2}-\\d{2}")]),
        employeeIdCard: new FormControl("", [Validators.required, Validators.pattern("^([0-9]{9}|[0-9]{12})$")]),
        employeePhone: new FormControl("", [Validators.required, Validators.pattern("^(09[01][0-9]{7}|\\(84\\)\\+9[01][0-9]{7})$")]),
        employeeEmail: new FormControl("", [Validators.required, Validators.email]),
        employeeAddress: new FormControl("", [Validators.required, Validators.minLength(6)]),
        position: new FormControl("", Validators.required),
        educationDegree: new FormControl("", Validators.required),
        division: new FormControl("", Validators.required),
        employeeSalary: new FormControl("",[Validators.required,gte])
      })
    })
  }

  getAllPosition() {
    this.positionService.getAll().subscribe(next => {
      console.log(next)
      this.positions = next
    })
  }

  getAllLevel() {
    this.educationDegreeService.getAll().subscribe(next => {
      console.log(next)
      this.educationDegrees = next;
    })
  }

  getAllDepartment() {
    this.divisionService.getAll().subscribe(next => {
      console.log(next)
      this.divisions = next;
    })
  }

  ngOnInit(): void {
    this.getAllPosition();
    this.getAllDepartment();
    this.getAllLevel();
  }

  createEmployee() {
    console.log(this.employeeGroup);
    this.employeeService.addEmployee(this.employeeGroup.value).subscribe(() => {
      this.router.navigateByUrl("employee")
    }, error => {
      console.log(error)
    })
  }

}
