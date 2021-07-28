import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CompanyListComponent } from './components/company-list/company-list.component';
import { CreateCompanyComponent } from './components/create-company/create-company/create-company.component';
import { CreateIpoComponent } from './components/create-ipo/create-ipo/create-ipo.component';
import { CreateSectorComponent } from './components/create-sector/create-sector/create-sector.component';
import { CreateStockComponent } from './components/create-stock/create-stock/create-stock.component';
import { CreateStockexComponent } from './components/create-stockex/create-stockex/create-stockex.component';
import { HomeComponent } from './components/home/home/home.component';
// import { HomeComponent } from './components/home/home/home.component';
import { IpoListComponent } from './components/ipo-list/ipo-list.component';
import { LoginComponent } from './components/login/login/login.component';
import { SectorListComponent } from './components/sector-list/sector-list/sector-list.component';
import { StockListComponent } from './components/stock-list/stock-list/stock-list.component';
import { StockexListComponent } from './components/stockex-list/stockex-list/stockex-list.component';
import { UpdateCompanyComponent } from './components/update-company/update-company/update-company.component';
import { UpdateSectorComponent } from './components/update-sector/update-sector/update-sector.component';


const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: '', redirectTo: 'login', pathMatch:'full'},
  {path: 'home', component: HomeComponent},
  {path: 'company/display', component: CompanyListComponent},
  {path: 'company/create', component: CreateCompanyComponent},
  {path: 'company/ipo', component: IpoListComponent},
  {path: 'sector', component: SectorListComponent},
  {path: 'stockex', component: StockexListComponent},
  {path: 'stockex/create', component: CreateStockexComponent},
  {path: 'company/editCompany/:id', component: UpdateCompanyComponent},
  {path: 'company/stocks', component: StockListComponent},
  {path: 'company/createIpo', component: CreateIpoComponent},
  {path: 'sector/createSector', component: CreateSectorComponent},
  {path: 'sector/editSector/:id', component: UpdateSectorComponent},
  {path: 'company/createStocks', component: CreateStockComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
