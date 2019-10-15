import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GroupproductComponent } from './groupproduct.component';

const routes: Routes = [{ path: 'allgroupproduct', component: GroupproductComponent }];

@NgModule({
  imports: [RouterModule.forRoot(routes, { useHash: true })],
  exports: [RouterModule]
})
export class GroupproductRoutingModule { }
