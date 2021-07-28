import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CompanyListComponent } from './components/company-list/company-list.component';
import { HomeComponent } from './components/home/home/home.component';
import { CreateCompanyComponent } from './components/create-company/create-company/create-company.component';
import { FormsModule } from '@angular/forms';
import { IpoListComponent } from './components/ipo-list/ipo-list.component';
import { SectorListComponent } from './components/sector-list/sector-list/sector-list.component';
import { StockexListComponent } from './components/stockex-list/stockex-list/stockex-list.component';
import { UpdateCompanyComponent } from './components/update-company/update-company/update-company.component';
import { UpdateSectorComponent } from './components/update-sector/update-sector/update-sector.component';
import { UpdateStockexComponent } from './components/update-stockex/update-stockex/update-stockex.component';
import { StockListComponent } from './components/stock-list/stock-list/stock-list.component';
import { CreateIpoComponent } from './components/create-ipo/create-ipo/create-ipo.component';
import { CreateSectorComponent } from './components/create-sector/create-sector/create-sector.component';
import { CreateStockComponent } from './components/create-stock/create-stock/create-stock.component';
import { CreateStockexComponent } from './components/create-stockex/create-stockex/create-stockex.component';
import { UpdateStockComponent } from './components/update-stock/update-stock/update-stock.component';
import { LoginComponent } from './components/login/login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    CompanyListComponent,
    HomeComponent,
    CreateCompanyComponent,
    IpoListComponent,
    SectorListComponent,
    StockexListComponent,
    UpdateCompanyComponent,
    UpdateSectorComponent,
    UpdateStockexComponent,
    StockListComponent,
    CreateIpoComponent,
    CreateSectorComponent,
    CreateStockComponent,
    CreateStockexComponent,
    UpdateStockComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
