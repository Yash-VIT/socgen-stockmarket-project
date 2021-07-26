import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CompanyListComponent } from './components/company-list/company-list.component';
import { CreateCompanyComponent } from './components/create-company/create-company/create-company.component';
import { HomeComponent } from './components/home/home/home.component';
import { IpoListComponent } from './components/ipo-list/ipo-list.component';


const routes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: '', redirectTo: 'home', pathMatch:'full'},
  {path: 'company/display', component: CompanyListComponent},
  {path: 'company/create', component: CreateCompanyComponent},
  {path: 'company/ipo', component: IpoListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
