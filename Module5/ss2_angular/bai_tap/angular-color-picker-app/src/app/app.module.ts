import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AngularColorPickerAppComponent } from './angular-color-picker-app/angular-color-picker-app.component';

@NgModule({
  declarations: [
    AppComponent,
    AngularColorPickerAppComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
