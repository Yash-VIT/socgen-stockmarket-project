import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Stock } from 'src/app/models/stock/stock';

@Injectable({
  providedIn: 'root'
})
export class StockService {

  baseUrl ='http://localhost:8080/company/stocks';

  constructor(private httpClient: HttpClient) { }

  getStockList(): Observable<Stock[]> {
    console.log(this.httpClient.get<Stock[]>(`${this.baseUrl}`))
    return this.httpClient.get<Stock[]>(`${this.baseUrl}`);
  }
}
