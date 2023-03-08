import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ParentListComponent } from './parent/parent-list/parent-list.component';
import { ParentCreateComponent } from './parent/parent-create/parent-create.component';
import { ParentUpdateComponent } from './parent/parent-update/parent-update.component';
import { ParentComponent } from './parent/parent.component';
import {ParentModule} from "./parent/parent.module";
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import {HttpClientModule} from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ParentModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
