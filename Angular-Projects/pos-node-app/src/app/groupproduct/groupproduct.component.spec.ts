import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GroupproductComponent } from './groupproduct.component';

describe('GroupproductComponent', () => {
  let component: GroupproductComponent;
  let fixture: ComponentFixture<GroupproductComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GroupproductComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GroupproductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
