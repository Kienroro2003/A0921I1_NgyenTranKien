import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {EmployeeService} from "../../service/employee.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {Employee} from "../../model/employee";
import {gte} from "../../dto/gte.validator";
import {Position} from "../../model/position";
import {EducationDegree} from "../../model/education-degree";
import {Division} from "../../model/division";
import {PositionService} from "../../service/position.service";
import {EducationDegreeService} from "../../service/education-degree.service";
import {DivisionService} from "../../service/division.service";

@Component({
  selector: 'app-employee-edit',
  templateUrl: './employee-edit.component.html',
  styleUrls: ['./employee-edit.component.css']
})
export class EmployeeEditComponent implements OnInit {

  // @ts-ignore
  employeeGroup: FormGroup;

  // @ts-ignore
  employee: Employee;

  positions: Position[] = [];

  educationDegrees: EducationDegree[] = [];

  divisions: Division[] = [];

  constructor(
    private activatedRoute: ActivatedRoute,
    private positionService: PositionService,
    private educationDegreeService: EducationDegreeService,
    private divisionService: DivisionService,
    private employeeService: EmployeeService,
    private router: Router
  ) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap)=>{
      const id = paramMap.get("id");
      if (typeof id === "string") {
        this.employeeService.findById(parseInt(id)).subscribe(next=>
        {
          this.employee = next;
          console.log(next)
          this.employeeGroup = new FormGroup({
            id: new FormControl(next.id),
            employeeName: new FormControl(next.employeeName, [Validators.required, Validators.minLength(6)]),
            employeeBirthday: new FormControl(next.employeeBirthday, [Validators.required, Validators.pattern("\\d{4}-\\d{2}-\\d{2}")]),
            employeeIdCard: new FormControl(next.employeeIdCard, [Validators.required, Validators.pattern("^([0-9]{9}|[0-9]{12})$")]),
            employeePhone: new FormControl(next.employeePhone, [Validators.required, Validators.pattern("^(09[01][0-9]{7}|\\(84\\)\\+9[01][0-9]{7})$")]),
            employeeEmail: new FormControl(next.employeeEmail, [Validators.required, Validators.email]),
            employeeAddress: new FormControl(next.employeeAddress, [Validators.required, Validators.minLength(6)]),
            position: new FormControl(next.position, Validators.required),
            educationDegree: new FormControl(next.educationDegree, Validators.required),
            division: new FormControl(next.division, Validators.required),
            employeeSalary: new FormControl(next.employeeSalary,[Validators.required,gte])
          })
        })
      }
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

  updateEmployee() {
    let employee: Employee = this.employeeGroup.value;
    this.employeeService.updateEmployee(employee.id, employee).subscribe(next=>{
      this.router.navigateByUrl("employee");
    })
  }

  compareFn(o1: Position|EducationDegree|Division, o2: Position|EducationDegree|Division){
    return o1 && o2 ? o1.id === o2.id : o1 === o2;
  }
}
