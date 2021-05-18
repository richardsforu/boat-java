import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CanDeactivateGuardService } from './can-deactivate-guard.service';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ProductFormComponent } from './product-form/product-form.component';
import { ProductsComponent } from './products/products.component';
import { SearchProductComponent } from './search-product/search-product.component';

const routes: Routes = [

  { path: 'home', component: DashboardComponent },
  { path: 'find/:id', component: SearchProductComponent },
  { path: 'findAll', component: ProductsComponent },
  { path: 'form', component: ProductFormComponent, canDeactivate: [CanDeactivateGuardService] },
  { path: 'form/:id', component: ProductFormComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
