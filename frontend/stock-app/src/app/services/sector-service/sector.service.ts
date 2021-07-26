import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Sector } from 'src/app/models/sector/sector';

@Injectable({
  providedIn: 'root'
})
export class SectorService {

  baseUrl ='http://localhost:8080/sector';

  constructor(private httpClient: HttpClient) { }

  getSectorList(): Observable<Sector[]> {
    console.log(this.httpClient.get<Sector[]>(`${this.baseUrl}`))
    return this.httpClient.get<Sector[]>(`${this.baseUrl}`);
  }

}
