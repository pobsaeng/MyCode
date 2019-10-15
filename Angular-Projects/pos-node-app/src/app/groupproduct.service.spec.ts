import { TestBed, inject } from '@angular/core/testing';

import { GroupproductService } from './groupproduct.service';

describe('GroupproductService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [GroupproductService]
    });
  });

  it('should be created', inject([GroupproductService], (service: GroupproductService) => {
    expect(service).toBeTruthy();
  }));
});
