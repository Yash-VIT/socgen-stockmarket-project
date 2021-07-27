import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Sector } from 'src/app/models/sector/sector';
import { SectorService } from 'src/app/services/sector-service/sector.service';

@Component({
  selector: 'app-create-sector',
  templateUrl: './create-sector.component.html',
  styleUrls: ['./create-sector.component.css']
})
export class CreateSectorComponent implements OnInit {

  constructor(private sectorService: SectorService,
    private router: Router) { }

    sector: Sector = new Sector();

  ngOnInit(): void {
  }

  onSubmit(){
    
  }

}
