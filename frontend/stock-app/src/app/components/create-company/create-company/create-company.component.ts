import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CompanyDto } from 'src/app/models/company/company-dto';
import { CompanyService } from 'src/app/services/company-service/company.service';

@Component({
  selector: 'app-create-company',
  templateUrl: './create-company.component.html',
  styleUrls: ['./create-company.component.css']
})
export class CreateCompanyComponent implements OnInit {

  companyDto: CompanyDto = new CompanyDto();

  constructor(private companyService: CompanyService,
    private router: Router) { }

  ngOnInit(): void {
  }

  saveCompany() {
    this.companyService.createCompany(this.companyDto).subscribe(data => {
      console.log(data);
      this.goToCompanyList();
    }),
      error => console.log(error);
  }

  goToCompanyList(){
    this.router.navigate(['/home']);
  }

  onSubmit(){
    this.saveCompany();
  }

}
