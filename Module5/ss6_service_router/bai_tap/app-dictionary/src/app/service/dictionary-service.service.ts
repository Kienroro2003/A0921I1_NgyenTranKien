import { Injectable } from '@angular/core';
import {IWord} from "../model/iword";

@Injectable({
  providedIn: 'root'
})
export class DictionaryServiceService {
  vocabularies: IWord[] = [
    {
      word: "one",
      mean: "mot"
    },
    {
      word: "two",
      mean: "hai"
    },
    {
      word: "three",
      mean: "ba"
    },
    {
      word: "four",
      mean: "bon"
    },
    {
      word: "five",
      mean: "nam"
    },

  ];
  constructor() { }

  getAll(word: string){
    if(word == ""){
      return this.vocabularies;
    }else{
      return this.vocabularies.filter((item)=>word== item.word);
    }
  }

  findByWord(wordParam: string | null){
    let total: any;
    for(let word of this.vocabularies){
      if(wordParam == word.word){
        total = word;
      }
    }
    return total;
  }
}
