import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Stockex } from 'src/app/models/stockex/stockex';
import { StockexService } from 'src/app/services/stockex-service/stockex.service';

@Component({
  selector: 'app-create-stockex',
  templateUrl: './create-stockex.component.html',
  styleUrls: ['./create-stockex.component.css']
})
export class CreateStockexComponent implements OnInit {

  stockex:Stockex = new Stockex();

  constructor(private stockexService: StockexService,
    private router: Router) { }

  ngOnInit(): void {
  }

  onSubmit(){
    
  }


}
