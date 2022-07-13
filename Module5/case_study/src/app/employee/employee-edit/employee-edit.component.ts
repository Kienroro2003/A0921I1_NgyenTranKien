import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {EmployeePosition} from "../../model/employee-position";
import {EmployeeLevel} from "../../model/employee-level";
import {EmployeeDepartment} from "../../model/employee-department";
import {EmployeePositionService} from "../../service/employee-position.service";
import {EmployeeLevelService} from "../../service/employee-level.service";
import {EmployeeDepartmentService} from "../../service/employee-department.service";
import {EmployeeService} from "../../service/employee.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {Employee} from "../../model/employee";
import {gte} from "../../dto/gte.validator";

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

  employeePositions: EmployeePosition[] = [];

  employeeLevels: EmployeeLevel[] = [];

  employeeDepartments: EmployeeDepartment[] = [];

  constructor(
    private activatedRoute: ActivatedRoute,
    private employeePositionService: EmployeePositionService,
    private employeeLevelService: EmployeeLevelService,
    private employeeDepartmentService: EmployeeDepartmentService,
    private employeeService: EmployeeService,
    private router: Router
  ) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap)=>{
      const id = paramMap.get("id");
      if (typeof id === "string") {
        this.employeeService.findById(parseInt(id)).subscribe(next=>
        {
          this.employee = next;
          this.employeeGroup = new FormGroup({
            id: new FormControl(next.id),
            idEmployee: new FormControl(next.idEmployee, [Validators.required, Validators.pattern("^KH\\-[0-9]{4}$")]),
            nameEmployee: new FormControl(next.nameEmployee, [Validators.required, Validators.minLength(6)]),
            dateOfBirth: new FormControl(next.dateOfBirth, [Validators.required, Validators.pattern("\\d{4}-\\d{2}-\\d{2}")]),
            idCard: new FormControl(next.idCard, [Validators.required, Validators.pattern("^([0-9]{9}|[0-9]{12})$")]),
            phoneNumber: new FormControl(next.phoneNumber, [Validators.required, Validators.pattern("^(09[01][0-9]{7}|\\(84\\)\\+9[01][0-9]{7})$")]),
            email: new FormControl(next.email, [Validators.required, Validators.email]),
            position: new FormControl(next.position, Validators.required),
            level: new FormControl(next.level, Validators.required),
            department: new FormControl(next.department, Validators.required),
            salary: new FormControl(next.salary,[Validators.required,gte])
          })
        })
      }
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

  updateEmployee() {
    let employee: Employee = this.employeeGroup.value;
    this.employeeService.updateEmployee(employee.id, employee).subscribe(next=>{
      this.router.navigateByUrl("employee");
    })
  }

  compareFn(o1: EmployeePosition|EmployeeLevel|EmployeeDepartment, o2: EmployeePosition|EmployeeLevel|EmployeeDepartment){
    return o1 && o2 ? o1.id === o2.id : o1 === o2;
  }
}
