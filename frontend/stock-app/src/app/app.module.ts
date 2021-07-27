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

@NgModule({
  declarations: [
    AppComponent,
    CompanyListComponent,
    HomeComponent,
    CreateCompanyComponent,
    IpoListComponent,
    SectorListComponent,
    StockexListComponent
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
