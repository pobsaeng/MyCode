import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { CategoriesComponent } from './categories.component';
import { CategoriesRoutesModule } from './categories-routes.module';
// import { ModalComponent } from '../modal/modal.component';
// import { CustomerComponent } from '../customer/customer.component';

// import { ModalModule } from '../modal/modal.module';

@NgModule({
  imports: [
    NgbModule.forRoot(), // modal
    CommonModule,
    CategoriesRoutesModule
  ],
  declarations: [
    CategoriesComponent,

    // CustomerComponent,
    // ModalComponent //modal component
  ]
})
export class CategoriesModule { }
