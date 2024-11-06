import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomepageComponent } from './Homepage/homepage/homepage.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { PaymentStatusComponent } from './Payment-Page/payment-status/payment-status.component';
import { ProductDetailComponent } from './Product-Detail-Page/product-detail/product-detail.component';
import { ProductListComponent } from './Product-List-Page/product-list/product-list.component';
import { CheckoutComponent } from './Checkout-Page/checkout/checkout.component';

@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    PaymentStatusComponent,
    ProductDetailComponent,
    ProductListComponent,
    CheckoutComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
