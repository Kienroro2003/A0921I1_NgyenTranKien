import { Component } from '@angular/core';
import {render} from "creditcardpayments/creditCardPayments";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  constructor() {
    render({
      id: "#myPaypalButtons",
      currency: "USD",
      value: "100",
      onApprove: (details) =>{
        alert("Transaction Successful");
      }
    })
  }
}