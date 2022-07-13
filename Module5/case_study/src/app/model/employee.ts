import {EmployeePosition} from "./employee-position";
import {EmployeeLevel} from "./employee-level";
import {EmployeeDepartment} from "./employee-department";

export interface Employee {
  id: number,
  idEmployee: string,
  nameEmployee: string,
  dateOfBirth: Date,
  idCard: string,
  phoneNumber: string,
  email: string,
  position: EmployeePosition,
  level: EmployeeLevel,
  department: EmployeeDepartment,
  salary: number
}
