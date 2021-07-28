import { Component, OnInit } from '@angular/core';
import { CompanyDto } from 'src/app/models/company/company-dto';

@Component({
  selector: 'app-update-company',
  templateUrl: './update-company.component.html',
  styleUrls: ['./update-company.component.css']
})
export class UpdateCompanyComponent implements OnInit {

  companyDto: CompanyDto = new CompanyDto();

  constructor() { }

  ngOnInit(): void {
  }

  onSubmit(){
    
  }

}
