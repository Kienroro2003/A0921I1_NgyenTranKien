import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ParentComponent} from "./parent.component";
import {ParentListComponent} from "./parent-list/parent-list.component";
import {ParentCreateComponent} from "./parent-create/parent-create.component";
import {ParentUpdateComponent} from "./parent-update/parent-update.component";
import {ParentInfoComponent} from "./parent-info/parent-info.component";

const routes: Routes = [
  {
    path: "parent",component: ParentComponent, children:[
      {path: "", component: ParentListComponent},
      {path: "create", component: ParentCreateComponent},
      {path: "edit/:id", component: ParentUpdateComponent},
      {path: "info/:id",component: ParentInfoComponent},
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ParentRoutingModule { }
