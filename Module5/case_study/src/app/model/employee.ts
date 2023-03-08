import {Position} from "./position";
import {EducationDegree} from "./education-degree";
import {Division} from "./division";

export interface Employee {
  id: number,
  employeeName: string,
  employeeBirthday: Date,
  employeeIdCard: string,
  employeePhone: string,
  employeeEmail: string,
  employeeAddress: string,
  employeeSalary: number,
  position: Position,
  educationDegree: EducationDegree,
  division: Division,

}
