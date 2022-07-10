import { Component, OnInit } from '@angular/core';
import {IWord} from "../model/iword";
import {DictionaryServiceService} from "../service/dictionary-service.service";

@Component({
  selector: 'app-dictionary-page',
  templateUrl: './dictionary-page.component.html',
  styleUrls: ['./dictionary-page.component.css']
})
export class DictionaryPageComponent implements OnInit {
  vocabularies: IWord[] = [];
  search: string = "";
  constructor(private dictionaryServiceService: DictionaryServiceService) { }

  ngOnInit(): void {
    this.getAll();
  }

  getAll(word: string = ""){
    this.vocabularies = this.dictionaryServiceService.getAll(word);
  }

  findAllByWord(){
    this.getAll(this.search);
  }
}
