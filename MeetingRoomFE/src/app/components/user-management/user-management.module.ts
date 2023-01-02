import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ChangePasswordComponent } from './change-password/change-password.component';
import { CreateUserComponent } from './create-user/create-user.component';
import { ListUserComponent } from './list-user/list-user.component';
import { UpdateUserComponent } from './update-user/update-user.component';
import { UserManagementRoutingModule } from 'src/app/routing/user-management-routing.module';



@NgModule({
  declarations: [
    ChangePasswordComponent,
    CreateUserComponent,
    ListUserComponent,
    UpdateUserComponent
  ],
  imports: [
    CommonModule,
    UserManagementRoutingModule
  ]
})
export class UserManagementModule { }
