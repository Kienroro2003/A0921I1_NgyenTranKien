import {Component, OnInit} from '@angular/core';
import {IWord} from "../model/iword";
import {ActivatedRoute, ParamMap} from "@angular/router";
import {DictionaryServiceService} from "../service/dictionary-service.service";

@Component({
  selector: 'app-dictionary-detail',
  templateUrl: './dictionary-detail.component.html',
  styleUrls: ['./dictionary-detail.component.css']
})
export class DictionaryDetailComponent implements OnInit {
  total: any;

  constructor(private activatedRoute: ActivatedRoute, private dictionaryServiceService: DictionaryServiceService) {
    activatedRoute.paramMap.subscribe((param: ParamMap) => {
      const word = param.get('word');
      console.log(word);
      this.total = dictionaryServiceService.findByWord(word);
    })
  }

  ngOnInit(): void {
  }



}
