import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CancelSignroomComponent } from './cancel-signroom/cancel-signroom.component';
import { DeleteRegistrationHistoryComponent } from './delete-registration-history/delete-registration-history.component';
import { ListRegistrationHistoryComponent } from './list-registration-history/list-registration-history.component';
import { SignupRoomComponent } from './signup-room/signup-room.component';
import { StatisticRoomFormComponent } from './statistic-room-form/statistic-room-form.component';
import { StatisticTimeTableComponent } from './statistic-time-table/statistic-time-table.component';
import { StatisticTimeFormComponent } from './statistic-time-form/statistic-time-form.component';
import { StatisticRoomTableComponent } from './statistic-room-table/statistic-room-table.component';
import { RegistrationHistoryManagementRoutingModule } from 'src/app/routing/registration-history-management-routing.module';



@NgModule({
  declarations: [
    CancelSignroomComponent,
    DeleteRegistrationHistoryComponent,
    ListRegistrationHistoryComponent,
    SignupRoomComponent,
    StatisticRoomFormComponent,
    StatisticTimeTableComponent,
    StatisticTimeFormComponent,
    StatisticRoomTableComponent
  ],
  imports: [
    CommonModule,
    RegistrationHistoryManagementRoutingModule
  ]
})
export class RegistrationHistoryManagementModule { }
