import {Component, OnInit} from '@angular/core';
import {CustomerService} from "../../service/customer.service";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {CustomerType} from "../../model/customer-type";
import {CustomerTypeService} from "../../service/customer-type.service";
import {Router} from "@angular/router";
import {Customer} from "../../model/customer";

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  customerGroup: FormGroup;

  customerTypes: CustomerType[] = [];

  customers: Customer[] = [];

  id: number = this.customers.length;
  constructor(
    private customerService: CustomerService,
    private customerTypeService: CustomerTypeService,
    private router: Router
  ) {
    this.customerGroup = new FormGroup({
      id: new FormControl(this.id++),
      idCustomer: new FormControl("", [Validators.required, Validators.pattern("^KH\\-[0-9]{4}$")]),
      name: new FormControl("", [Validators.required, Validators.minLength(6)]),
      dateOfBirth: new FormControl("", [Validators.required, Validators.pattern("\\d{4}-\\d{2}-\\d{2}")]),
      gender: new FormControl(true),
      idCard: new FormControl("", [Validators.required, Validators.pattern("^([0-9]{9}|[0-9]{12})$")]),
      phoneNumber: new FormControl("", [Validators.required, Validators.pattern("^09[01][0-9]{7}|\\(84\\)\\+9[01][0-9]{7}$")]),
      email: new FormControl("", [Validators.required, Validators.email]),
      customerType: new FormControl("", Validators.required),
      address: new FormControl("", Validators.required)
    })
  }

  ngOnInit(): void {
    this.getAllCustomerType();
    this.getAllCustomer()
  }

  getAllCustomerType() {
    this.customerTypeService.getAll().subscribe(next => {
      console.log(next);
      this.customerTypes = next;
    })
  }

  getAllCustomer(){
    this.customerService.getAll().subscribe(next=>{
      this.customers = next;
    })
  }

  createCustomer() {
    console.log(this.customerGroup.value);
    this.customerService.addCustomer(this.customerGroup.value).subscribe(next=>{
      this.router.navigateByUrl('customer');
    })
  }

}
