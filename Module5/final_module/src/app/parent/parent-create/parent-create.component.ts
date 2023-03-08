import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormControl, FormGroup, ValidationErrors, Validators} from "@angular/forms";
import {ParentService} from "../../service/parent.service";
import {Router} from "@angular/router";
import {CustomerValidators} from "../../dto/customer-validators";
import {ChildService} from "../../service/child.service";
import {Child} from "../../model/child";

@Component({
  selector: 'app-parent-create',
  templateUrl: './parent-create.component.html',
  styleUrls: ['./parent-create.component.css']
})
export class ParentCreateComponent implements OnInit {
  children: Child[] = [];
  groups: string[] = ["Group 1","Group 2", "Group 3"];

  // @ts-ignore
  parentForm: FormGroup;

  constructor(
    private parentService: ParentService,
    private childService: ChildService,
    private router: Router
  ) {
    this.parentService.getAll().subscribe(next => {
      this.parentForm = new FormGroup({
        id: new FormControl(next.length + 1),
        name: new FormControl("", [Validators.required, Validators.pattern("^[a-zA-Z0-9 ]*$")]),
        group: new FormControl("", [Validators.required, Validators.pattern("^Nhóm [0-9]{1}$")]),
        teacher: new FormControl("", [Validators.required]),
        content: new FormControl("", [Validators.required,Validators.minLength(6)]),
        email: new FormControl("", [Validators.required, Validators.pattern("^[a-zA-Z0-9]+\\@def.com$")]),
        phoneNumber: new FormControl("", [Validators.required, Validators.pattern("^([0-9]{10}|[0-9]{12})$")])
      })
    })
  }

  ngOnInit(): void {
    this.getAllChild();
  }

  getAllChild() {
    this.childService.getAll().subscribe(next => {
      console.log(next)
      this.children = next;
    })
  }

  createParent() {
    console.log(this.parentForm)
    this.parentService.addParent(this.parentForm.value).subscribe(() => {
        // this.router.navigateByUrl("parent/edit/1");
        // this.router.navigate(["parent","edit", "1"])
      }
    )
  }


}
