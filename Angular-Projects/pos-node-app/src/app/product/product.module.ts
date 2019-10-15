import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { ProductRoutingModule } from './product-routing.module';
import { ProductComponent } from './product.component';
import { ProductService } from './product.service';

@NgModule({
  imports: [
    NgbModule.forRoot(), // modal
    CommonModule,
    ProductRoutingModule
  ],
  providers: [
    ProductService
  ],
  declarations: [ProductComponent]
})
export class ProductModule { }
