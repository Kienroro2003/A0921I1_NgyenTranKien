import { Component, OnInit } from '@angular/core';
import {IRatingUnit} from "../module/IRatingUnit";

@Component({
  selector: 'app-rating-bar-component',
  templateUrl: './rating-bar-component.component.html',
  styleUrls: ['./rating-bar-component.component.css']
})
export class RatingBarComponentComponent implements OnInit {
  ratingUnits: Array<IRatingUnit> = [];

  constructor() { }

  ngOnInit(): void {
  }

}
