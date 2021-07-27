import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateStockexComponent } from './update-stockex.component';

describe('UpdateStockexComponent', () => {
  let component: UpdateStockexComponent;
  let fixture: ComponentFixture<UpdateStockexComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateStockexComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateStockexComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
