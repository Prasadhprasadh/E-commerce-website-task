import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomepageComponent } from './Homepage/homepage/homepage.component';
import { ProductListComponent } from './Product-List-Page/product-list/product-list.component';
import { ProductDetailComponent } from './Product-Detail-Page/product-detail/product-detail.component';
import { CheckoutComponent } from './Checkout-Page/checkout/checkout.component';
import { PaymentStatusComponent } from './Payment-Page/payment-status/payment-status.component';

const routes: Routes = [
  {path:"homepage",component:HomepageComponent},
  {path:"products",component:ProductListComponent},
  { path: 'product/:id', component: ProductDetailComponent },

  {path:"checkout",component:CheckoutComponent},
  {path:"payment-status",component:PaymentStatusComponent},
  { path: '', redirectTo: '/checkout', pathMatch: 'full' },




];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
