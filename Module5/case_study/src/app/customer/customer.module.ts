import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CustomerRoutingModule } from './customer-routing.module';
import { CustomerCreateComponent } from './customer-create/customer-create.component';
import { CustomerEditComponent } from './customer-edit/customer-edit.component';
import { CustomerInfoComponent } from './customer-info/customer-info.component';
import {CustomerListComponent} from "./customer-list/customer-list.component";
import {CustomerComponent} from "./customer.component";
import {ReactiveFormsModule} from "@angular/forms";


@NgModule({
  declarations: [
    CustomerCreateComponent,
    CustomerEditComponent,
    CustomerInfoComponent,
    CustomerListComponent,
    CustomerComponent,

  ],
  imports: [
    CommonModule,
    CustomerRoutingModule,
    ReactiveFormsModule,
  ]
})
export class CustomerModule { }
