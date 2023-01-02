import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListCategoryEquipmentComponent } from './list-category-equipment.component';

describe('ListCategoryEquipmentComponent', () => {
  let component: ListCategoryEquipmentComponent;
  let fixture: ComponentFixture<ListCategoryEquipmentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListCategoryEquipmentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListCategoryEquipmentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
