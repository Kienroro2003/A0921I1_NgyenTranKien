import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  firstNumber:number;
  secondNumber:number;

  total: number = 0;


  setSecondNumber(value: any) {
    this.secondNumber = Number(value.value);
  }


  setFirstNumber(value: any) {
    this.firstNumber = Number(value.value);
  }

  choiceCal(operator:any){
    let choice:string = operator.value;
    switch (choice) {
      case "+":{
        this.total = this.firstNumber + this.secondNumber;
        break
      }
      case "-":{
        this.total = this.firstNumber - this.secondNumber;
        break
      }
      case "*":{
        this.total = this.firstNumber * this.secondNumber;
        break
      }
      case "/":{
        this.total = this.firstNumber / this.secondNumber;
        break
      }
    }
  }

  constructor() {
    this.firstNumber = 0;
    this.secondNumber = 0;
  }

  ngOnInit(): void {
  }

}
