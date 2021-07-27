import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StockexListComponent } from './stockex-list.component';

describe('StockexListComponent', () => {
  let component: StockexListComponent;
  let fixture: ComponentFixture<StockexListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StockexListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StockexListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
