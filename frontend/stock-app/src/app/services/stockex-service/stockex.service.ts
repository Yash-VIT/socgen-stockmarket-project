import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Stockex } from 'src/app/models/stockex/stockex';

@Injectable({
  providedIn: 'root'
})
export class StockexService {

  baseUrl ='http://localhost:8080/stockex';

  constructor(private httpClient: HttpClient) { }

  getStockexList(): Observable<Stockex[]> {
    console.log(this.httpClient.get<Stockex[]>(`${this.baseUrl}`))
    return this.httpClient.get<Stockex[]>(`${this.baseUrl}`);
  }
}
