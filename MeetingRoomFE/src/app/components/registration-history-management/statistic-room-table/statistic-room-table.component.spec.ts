import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StatisticRoomTableComponent } from './statistic-room-table.component';

describe('StatisticRoomTableComponent', () => {
  let component: StatisticRoomTableComponent;
  let fixture: ComponentFixture<StatisticRoomTableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StatisticRoomTableComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StatisticRoomTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
