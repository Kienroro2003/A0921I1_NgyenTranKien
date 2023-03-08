import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ParentRoutingModule } from './parent-routing.module';
import {ParentListComponent} from "./parent-list/parent-list.component";
import {ParentCreateComponent} from "./parent-create/parent-create.component";
import {ParentUpdateComponent} from "./parent-update/parent-update.component";
import {ParentComponent} from "./parent.component";
import {ReactiveFormsModule} from "@angular/forms";
import { ParentInfoComponent } from './parent-info/parent-info.component';
import {NgxPaginationModule} from "ngx-pagination";


@NgModule({
  declarations: [
    ParentListComponent,
    ParentCreateComponent,
    ParentUpdateComponent,
    ParentComponent,
    ParentInfoComponent,
  ],
    imports: [
        CommonModule,
        ParentRoutingModule,
        ReactiveFormsModule,
        NgxPaginationModule,
    ]
})
export class ParentModule { }
