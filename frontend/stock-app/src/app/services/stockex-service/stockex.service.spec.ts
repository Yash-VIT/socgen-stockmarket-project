import { TestBed } from '@angular/core/testing';

import { StockexService } from './stockex.service';

describe('StockexService', () => {
  let service: StockexService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(StockexService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
