import { Component, OnInit } from '@angular/core';
import { Ipo } from 'src/app/models/ipo/ipo';
import { IpoService } from 'src/app/services/ipo-service/ipo.service';

@Component({
  selector: 'app-ipo-list',
  templateUrl: './ipo-list.component.html',
  styleUrls: ['./ipo-list.component.css']
})
export class IpoListComponent implements OnInit {


  ipoDto : Ipo[];

  constructor(private ipoService: IpoService) { }

  ngOnInit(): void {
    this.getIpoList();
  }

  private getIpoList(){
    this.ipoService.getIpoList().subscribe((data) => {
      this.ipoDto = data;
    })
  }

}
