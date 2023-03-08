import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Position} from "../model/position";

@Injectable({
  providedIn: 'root'
})
export class PositionService {
  private URL: string;

  constructor(private httpClient: HttpClient) {
    this.URL = "http://localhost:8080/position";
  }

  getAll(): Observable<Position[]> {
    return this.httpClient.get<Position[]>(this.URL + "/list");
  }
}
