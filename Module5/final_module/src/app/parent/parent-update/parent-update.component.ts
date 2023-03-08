import {Component, OnInit} from '@angular/core';
import {ParentService} from "../../service/parent.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {CustomerValidators} from "../../dto/customer-validators";
import {Parent} from "../../model/parent";
import {Child} from "../../model/child";
import {ChildService} from "../../service/child.service";

@Component({
  selector: 'app-parent-update',
  templateUrl: './parent-update.component.html',
  styleUrls: ['./parent-update.component.css']
})
export class ParentUpdateComponent implements OnInit {
  // @ts-ignore
  parentForm: FormGroup;

  children: Child[] = []

  constructor(
    private activatedRoute: ActivatedRoute,
    private parentService: ParentService,
    private childService: ChildService,
    private router: Router
  ) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = paramMap.get("id");
      if (typeof id === "string") {
        this.parentService.findById(parseInt(id)).subscribe(next => {
          this.parentForm = new FormGroup({
            id: new FormControl(next.id),
            name: new FormControl(next.name, [Validators.required, Validators.pattern("^[a-zA-Z0-9 ]*$")]),
            group: new FormControl(next.group, [Validators.required, Validators.pattern("^Nhóm [0-9]{1}$")]),
            teacher: new FormControl(next.teacher, [Validators.required]),
            content: new FormControl(next.content, [Validators.required, Validators.minLength(6)]),
            email: new FormControl(next.email, [Validators.required, Validators.pattern("^[a-zA-Z0-9]+\\@def.com$")]),
            phoneNumber: new FormControl(next.phoneNumber, [Validators.required, Validators.pattern("^[0-9]{10,12}$")])
          })
        })
      }
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

  compareFn(o1: Child, o2: Child){
    return o1 && o2 ? o1.id === o2.id : o1 === o2;
  }

  updateParent() {
    let parent: Parent = this.parentForm.value;
    this.parentService.updateParent(parent.id, parent).subscribe(() => {
      this.router.navigateByUrl("parent")
    })
  }

  getExit(){
    this.router.navigateByUrl("parent")
  }
}
