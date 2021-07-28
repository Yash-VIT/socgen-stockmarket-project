import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Stock } from 'src/app/models/stock/stock';
import { StockService } from 'src/app/services/stock-service/stock.service';

@Component({
  selector: 'app-create-stock',
  templateUrl: './create-stock.component.html',
  styleUrls: ['./create-stock.component.css']
})
export class CreateStockComponent implements OnInit {

  stock: Stock = new Stock();

  constructor(private stockService: StockService,
    private router: Router) { }

  ngOnInit(): void {
  }

  onSubmit(){
    
  }

}
