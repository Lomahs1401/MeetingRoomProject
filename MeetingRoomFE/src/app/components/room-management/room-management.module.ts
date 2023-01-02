import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateRoomComponent } from './create-room/create-room.component';
import { DeleteRoomComponent } from './delete-room/delete-room.component';
import { DetailRoomComponent } from './detail-room/detail-room.component';
import { ListRoomComponent } from './list-room/list-room.component';
import { UpdateRoomComponent } from './update-room/update-room.component';
import { RoomManagementRoutingModule } from 'src/app/routing/room-management-routing.module';



@NgModule({
  declarations: [
    CreateRoomComponent,
    DeleteRoomComponent,
    DetailRoomComponent,
    ListRoomComponent,
    UpdateRoomComponent
  ],
  imports: [
    CommonModule,
    RoomManagementRoutingModule
  ]
})
export class RoomManagementModule { }
