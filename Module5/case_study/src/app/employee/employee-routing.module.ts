import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {EmployeeComponent} from "./employee.component";
import {EmployeeListComponent} from "./employee-list/employee-list.component";
import {EmployeeCreateComponent} from "./employee-create/employee-create.component";
import {EmployeeEditComponent} from "./employee-edit/employee-edit.component";
import {EmployeeInfoComponent} from "./employee-info/employee-info.component";

const routes: Routes = [
  {path:"employee", component: EmployeeComponent, children:[
      {path: "", component: EmployeeListComponent},
      {path: "create", component: EmployeeCreateComponent},
      {path: "edit/:id", component: EmployeeEditComponent},
      {path: "info/:id", component: EmployeeInfoComponent},
    ]}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class EmployeeRoutingModule { }
