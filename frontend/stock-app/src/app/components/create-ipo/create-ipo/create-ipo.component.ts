import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Ipo } from 'src/app/models/ipo/ipo';
import { IpoService } from 'src/app/services/ipo-service/ipo.service';

@Component({
  selector: 'app-create-ipo',
  templateUrl: './create-ipo.component.html',
  styleUrls: ['./create-ipo.component.css']
})
export class CreateIpoComponent implements OnInit {

  constructor(private ipoService: IpoService,
    private router: Router) { }

  ipo: Ipo = new Ipo();

  ngOnInit(): void {
  }

  onSubmit(){
    
  }

}
