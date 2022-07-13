import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { EmployeeRoutingModule } from './employee-routing.module';
import {EmployeeListComponent} from "./employee-list/employee-list.component";
import {EmployeeCreateComponent} from "./employee-create/employee-create.component";
import {EmployeeEditComponent} from "./employee-edit/employee-edit.component";
import {EmployeeInfoComponent} from "./employee-info/employee-info.component";
import {EmployeeComponent} from "./employee.component";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {FilterPipeModule} from "ngx-filter-pipe";
import {NgxPaginationModule} from "ngx-pagination";


@NgModule({
  declarations: [
    EmployeeListComponent,
    EmployeeCreateComponent,
    EmployeeEditComponent,
    EmployeeInfoComponent,
    EmployeeComponent
  ],
  imports: [
    CommonModule,
    EmployeeRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    FilterPipeModule,
    NgxPaginationModule,
  ]
})
export class EmployeeModule { }
