import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StatisticTimeTableComponent } from './statistic-time-table.component';

describe('StatisticTimeTableComponent', () => {
  let component: StatisticTimeTableComponent;
  let fixture: ComponentFixture<StatisticTimeTableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StatisticTimeTableComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StatisticTimeTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
