import {Component, OnInit} from '@angular/core';
import {EmployeePositionService} from "../../service/employee-position.service";
import {EmployeeLevelService} from "../../service/employee-level.service";
import {EmployeeDepartmentService} from "../../service/employee-department.service";
import {Router} from "@angular/router";
import {EmployeePosition} from "../../model/employee-position";
import {EmployeeLevel} from "../../model/employee-level";
import {EmployeeDepartment} from "../../model/employee-department";
import {EmployeeService} from "../../service/employee.service";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Employee} from "../../model/employee";
import {gte} from "../../dto/gte.validator";

@Component({
  selector: 'app-employee-create',
  templateUrl: './employee-create.component.html',
  styleUrls: ['./employee-create.component.css']
})
export class EmployeeCreateComponent implements OnInit {

  // @ts-ignore
  employeeGroup: FormGroup;

  employeePositions: EmployeePosition[] = [];

  employeeLevels: EmployeeLevel[] = [];

  employeeDepartments: EmployeeDepartment[] = [];

  constructor(
    private employeePositionService: EmployeePositionService,
    private employeeLevelService: EmployeeLevelService,
    private employeeDepartmentService: EmployeeDepartmentService,
    private employeeService: EmployeeService,
    private router: Router
  ) {
    this.employeeService.getAll().subscribe(next=>{
      this.employeeGroup = new FormGroup({
        id: new FormControl(next.length+1),
        idEmployee: new FormControl("", [Validators.required, Validators.pattern("^KH\\-[0-9]{4}$")]),
        nameEmployee: new FormControl("", [Validators.required, Validators.minLength(6)]),
        dateOfBirth: new FormControl("", [Validators.required, Validators.pattern("\\d{4}-\\d{2}-\\d{2}")]),
        idCard: new FormControl("", [Validators.required, Validators.pattern("^([0-9]{9}|[0-9]{12})$")]),
        phoneNumber: new FormControl("", [Validators.required, Validators.pattern("^(09[01][0-9]{7}|\\(84\\)\\+9[01][0-9]{7})$")]),
        email: new FormControl("", [Validators.required, Validators.email]),
        position: new FormControl("", Validators.required),
        level: new FormControl("", Validators.required),
        department: new FormControl("", Validators.required),
        salary: new FormControl("",[Validators.required,gte])
      })
    })
  }

  getAllPosition() {
    this.employeePositionService.getAll().subscribe(next => {
      console.log(next)
      this.employeePositions = next
    })
  }

  getAllLevel() {
    this.employeeLevelService.getAll().subscribe(next => {
      this.employeeLevels = next;
    })
  }

  getAllDepartment() {
    this.employeeDepartmentService.getAll().subscribe(next => {
      this.employeeDepartments = next;
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
