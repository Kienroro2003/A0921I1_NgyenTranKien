import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CustomerComponent} from "./customer.component";
import {CustomerListComponent} from "./customer-list/customer-list.component";
import {CustomerCreateComponent} from "./customer-create/customer-create.component";
import {CustomerEditComponent} from "./customer-edit/customer-edit.component";
import {CustomerInfoComponent} from "./customer-info/customer-info.component";

const routes: Routes = [
  {
    path: "customer",component: CustomerComponent, children:[
      {path: "", component: CustomerListComponent},
      {path: "create", component: CustomerCreateComponent},
      {path: "edit/:id", component: CustomerEditComponent},
      {path: "info/:id",component: CustomerInfoComponent},
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CustomerRoutingModule { }
