import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StatisticTimeFormComponent } from './statistic-time-form.component';

describe('StatisticTimeFormComponent', () => {
  let component: StatisticTimeFormComponent;
  let fixture: ComponentFixture<StatisticTimeFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StatisticTimeFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StatisticTimeFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
