import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CompanyListComponent } from './components/company-list/company-list.component';
import { CreateCompanyComponent } from './components/create-company/create-company/create-company.component';
import { HomeComponent } from './components/home/home/home.component';
import { IpoListComponent } from './components/ipo-list/ipo-list.component';
import { SectorListComponent } from './components/sector-list/sector-list/sector-list.component';
import { StockexListComponent } from './components/stockex-list/stockex-list/stockex-list.component';


const routes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: '', redirectTo: 'home', pathMatch:'full'},
  {path: 'company/display', component: CompanyListComponent},
  {path: 'company/create', component: CreateCompanyComponent},
  {path: 'company/ipo', component: IpoListComponent},
  {path: 'sector', component: SectorListComponent},
  {path: 'stockex', component: StockexListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
