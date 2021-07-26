import { Component, OnInit } from '@angular/core';
import { CompanyDto } from 'src/app/models/company/company-dto';
import { CompanyService } from 'src/app/services/company-service/company.service';

@Component({
  selector: 'app-company-list',
  templateUrl: './company-list.component.html',
  styleUrls: ['./company-list.component.css']
})
export class CompanyListComponent implements OnInit {

  companyDto : CompanyDto[];

  constructor(private companyService: CompanyService) { }

  ngOnInit(): void {
    this.getCompanyList();
  }

  private getCompanyList(){
    this.companyService.getCompanyList().subscribe((data) => {
      this.companyDto = data;
    })
  }

}
