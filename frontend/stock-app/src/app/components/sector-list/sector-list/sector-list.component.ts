import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Sector } from 'src/app/models/sector/sector';
import { SectorService } from 'src/app/services/sector-service/sector.service';

@Component({
  selector: 'app-sector-list',
  templateUrl: './sector-list.component.html',
  styleUrls: ['./sector-list.component.css']
})
export class SectorListComponent implements OnInit {

  sectorDto : Sector[];

  constructor(private sectorService: SectorService,
    private router: Router) { }

  ngOnInit(): void {
    this.getSectorList();
  }

  private getSectorList(){
    this.sectorService.getSectorList().subscribe((data) => {
      this.sectorDto = data;
    })
  }

  updateSector(id: String){
    this.router.navigate(['sector/editSector', id]);
  }

}
