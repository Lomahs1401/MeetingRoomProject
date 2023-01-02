import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './routing/app-routing.module';
import { AppComponent } from './app.component';
import { CreateEquipmentComponent } from './components/equipment-management/create-equipment/create-equipment.component';
import { DeleteEquipmentComponent } from './components/equipment-management/delete-equipment/delete-equipment.component';
import { ListEquipmentComponent } from './components/equipment-management/list-equipment/list-equipment.component';
import { UpdateEquipmentComponent } from './components/equipment-management/update-equipment/update-equipment.component';
import { ViewEquipmentComponent } from './components/equipment-management/view-equipment/view-equipment.component';
import { ListCategoryEquipmentComponent } from './components/equipment-management/list-category-equipment/list-category-equipment.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateEquipmentComponent,
    DeleteEquipmentComponent,
    ListEquipmentComponent,
    UpdateEquipmentComponent,
    ViewEquipmentComponent,
    ListCategoryEquipmentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
