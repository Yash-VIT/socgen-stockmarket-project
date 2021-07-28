import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Sector } from 'src/app/models/sector/sector';
import { SectorService } from 'src/app/services/sector-service/sector.service';

@Component({
  selector: 'app-update-sector',
  templateUrl: './update-sector.component.html',
  styleUrls: ['./update-sector.component.css']
})
export class UpdateSectorComponent implements OnInit {

  constructor(private sectorService: SectorService,
    private router: Router) { }

    sector: Sector = new Sector();

  ngOnInit(): void {
  }

  onSubmit(){
    
  }

}
