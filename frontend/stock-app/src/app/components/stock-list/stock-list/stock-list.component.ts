import { Component, OnInit } from '@angular/core';
import { Stock } from 'src/app/models/stock/stock';
import { StockService } from 'src/app/services/stock-service/stock.service';

@Component({
  selector: 'app-stock-list',
  templateUrl: './stock-list.component.html',
  styleUrls: ['./stock-list.component.css']
})
export class StockListComponent implements OnInit {

  stock:Stock[];

  constructor(private stockService: StockService) { }

  ngOnInit(): void {
    this.getStockList();
  }

  private getStockList(){
    this.stockService.getStockList().subscribe((data) => {
      this.stock = data;
    })
  }

}
