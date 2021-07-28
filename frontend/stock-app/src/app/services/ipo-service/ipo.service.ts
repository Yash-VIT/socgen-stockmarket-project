import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ipo } from 'src/app/models/ipo/ipo';

@Injectable({
  providedIn: 'root'
})
export class IpoService {

  baseUrl ='http://localhost:8080/company/ipo';
  createCompanyUrl ='http://localhost:9002/company/ipo';

  constructor(private httpClient: HttpClient) { }

  getIpoList(): Observable<Ipo[]> {
    return this.httpClient.get<Ipo[]>(`${this.baseUrl}`);
  }

  createIpo(ipo: Ipo): Observable<Object> {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json'
      })
    };
    return this.httpClient.post(`${this.createCompanyUrl}`, Ipo, httpOptions);
  }

}
