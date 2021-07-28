import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { CompanyDto } from 'src/app/models/company/company-dto';

@Injectable({
  providedIn: 'root'
})
export class CompanyService {

  baseUrl ='http://localhost:8080/company/display';
  createCompanyUrl ='http://localhost:9002/company/create';
  deleteCompanyUrl ='http://localhost:9002/company/remove';

  constructor(private httpClient: HttpClient) { }

  getCompanyList(): Observable<CompanyDto[]> {
    console.log( this.httpClient.get<CompanyDto[]>(`${this.baseUrl}`));
    return this.httpClient.get<CompanyDto[]>(`${this.baseUrl}`);
  }

  createCompany(companyDto: CompanyDto): Observable<boolean> {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json'
      })
    };
    return this.httpClient.post<boolean>(`${this.createCompanyUrl}`, companyDto, httpOptions);
  }

  deleteCompany(id: String): Observable<Object> {
    return this.httpClient.delete(`${this.deleteCompanyUrl}/${id}`);
  }


}
