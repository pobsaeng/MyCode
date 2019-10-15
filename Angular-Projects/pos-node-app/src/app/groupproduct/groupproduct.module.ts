import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { GroupproductRoutingModule } from './groupproduct-routing.module';
import { GroupproductComponent } from './groupproduct.component';
import { GroupproductService } from './groupproduct.service';
import { FixWordPipe } from '../common/FixWord.pipe';

@NgModule({
  imports: [
    FormsModule,
    ReactiveFormsModule,
    CommonModule,
    GroupproductRoutingModule,
  ],
  providers: [GroupproductService],
  declarations: [GroupproductComponent, FixWordPipe]
})
export class GroupproductModule { }
