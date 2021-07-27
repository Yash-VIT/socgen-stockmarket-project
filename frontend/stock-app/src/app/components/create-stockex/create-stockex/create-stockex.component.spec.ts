import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateStockexComponent } from './create-stockex.component';

describe('CreateStockexComponent', () => {
  let component: CreateStockexComponent;
  let fixture: ComponentFixture<CreateStockexComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateStockexComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateStockexComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
