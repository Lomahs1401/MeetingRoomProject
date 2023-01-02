import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateEquipmentComponent } from './create-equipment/create-equipment.component';
import { ViewEquipmentComponent } from './view-equipment/view-equipment.component';
import { DeleteEquipmentComponent } from './delete-equipment/delete-equipment.component';
import { UpdateEquipmentComponent } from './update-equipment/update-equipment.component';
import { ListEquipmentComponent } from './list-equipment/list-equipment.component';
import { ListCategoryEquipmentComponent } from './list-category-equipment/list-category-equipment.component';
import { EquipmentManagementRoutingModule } from 'src/app/routing/equipment-management-routing.module';



@NgModule({
  declarations: [
    CreateEquipmentComponent,
    ViewEquipmentComponent,
    DeleteEquipmentComponent,
    UpdateEquipmentComponent,
    ListEquipmentComponent,
    ListCategoryEquipmentComponent
  ],
  imports: [
    CommonModule,
    EquipmentManagementRoutingModule
  ]
})
export class EquipmentManagementModule { }
