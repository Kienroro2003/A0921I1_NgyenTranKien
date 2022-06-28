import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-angular-color-picker-app',
  templateUrl: './angular-color-picker-app.component.html',
  styleUrls: ['./angular-color-picker-app.component.css']
})
export class AngularColorPickerAppComponent implements OnInit {
  col:string = "#000";

  setColor(color: any){
    this.col = color.value;
    console.log(this.col);
  }


  constructor() { }

  ngOnInit(): void {
  }

}
