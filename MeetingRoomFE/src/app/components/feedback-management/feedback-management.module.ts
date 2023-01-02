import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateFeedbackComponent } from './create-feedback/create-feedback.component';
import { ListFeedbackComponent } from './list-feedback/list-feedback.component';
import { ResponseFeedbackComponent } from './response-feedback/response-feedback.component';
import { FeedbackManagementRoutingModule } from 'src/app/routing/feedback-management-routing.module';



@NgModule({
  declarations: [
    CreateFeedbackComponent,
    ListFeedbackComponent,
    ResponseFeedbackComponent
  ],
  imports: [
    CommonModule,
    FeedbackManagementRoutingModule
  ]
})
export class FeedbackManagementModule { }
