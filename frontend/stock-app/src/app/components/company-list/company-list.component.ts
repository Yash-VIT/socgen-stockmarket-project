import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CompanyDto } from 'src/app/models/company/company-dto';
import { CompanyService } from 'src/app/services/company-service/company.service';

@Component({
  selector: 'app-company-list',
  templateUrl: './company-list.component.html',
  styleUrls: ['./company-list.component.css']
})
export class CompanyListComponent implements OnInit {

  companyDto : CompanyDto[];

  constructor(private companyService: CompanyService,
    private router: Router) { }

  ngOnInit(): void {
    this.getCompanyList();
  }

  private getCompanyList(){
    this.companyService.getCompanyList().subscribe((data) => {
      this.companyDto = data;
    })
  }

  updateCompany(id: String){
    this.router.navigate(['company/editCompany', id]);
  }

  deleteCompany(id: String){
    this.companyService.deleteCompany(id).subscribe((data) => {
      this.getCompanyList();
    })
  }

}
