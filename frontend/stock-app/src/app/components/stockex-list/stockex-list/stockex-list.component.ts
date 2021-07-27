import { Component, OnInit } from '@angular/core';
import { Stockex } from 'src/app/models/stockex/stockex';
import { StockexService } from 'src/app/services/stockex-service/stockex.service';

@Component({
  selector: 'app-stockex-list',
  templateUrl: './stockex-list.component.html',
  styleUrls: ['./stockex-list.component.css']
})
export class StockexListComponent implements OnInit {

  stockexDto: Stockex[];

  constructor(private stockexService: StockexService) { }

  ngOnInit(): void {
    this.getStockexList();
  }

  private getStockexList(){
    this.stockexService.getStockexList().subscribe((data) => {
      this.stockexDto = data;
    })
  }

}
