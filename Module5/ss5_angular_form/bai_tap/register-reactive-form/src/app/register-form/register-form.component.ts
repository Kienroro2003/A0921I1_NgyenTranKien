import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormControl, FormGroup, ValidatorFn, Validators} from "@angular/forms";
import {min} from "rxjs";
import {CustomValidators} from "./custom-validators";

@Component({
  selector: 'app-register-form',
  templateUrl: './register-form.component.html',
  styleUrls: ['./register-form.component.css']
})
export class RegisterFormComponent implements OnInit {
  registerForm: FormGroup;

  constructor() {
    this.registerForm = new FormGroup({
      email: new FormControl("", [Validators.required, Validators.minLength(5)]),
      pwGroup: new FormGroup({
        password: new FormControl("",[Validators.required,Validators.minLength(6)]),
        confirmPassword: new FormControl("",Validators.required),
      },this.comparePassword),
      country: new FormControl("", Validators.required),
      age: new FormControl(18, Validators.min(18)),
      gender: new FormControl("", Validators.required),
      phone: new FormControl("", [Validators.required,Validators.pattern("^\\+84[0-9]{9,10}$")])
    })
  }

  countries: Array<string> =["Da Nang", "Ho Chi Minh","Hue"];


  ngOnInit(): void {
  }

  onSubmit() {
    alert("Đăng kí thành công tài khoản " + this.registerForm.value['email']);
  }

  comparePassword( c : AbstractControl) {
    const v = c.value;
    return (v.password === v.confirmPassword) ? null:{
      passwordNotMatch: true };
  }
}
