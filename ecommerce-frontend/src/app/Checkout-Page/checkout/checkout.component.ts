import { Component } from '@angular/core';
import { Checkout } from 'src/app/Product_model/Checkout-model';
import { CheckoutService } from 'src/app/Service/checkout.service';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.css']
})
export class CheckoutComponent {

  checkout: Checkout = new Checkout();
  message: string = '';

  constructor(private checkoutService: CheckoutService) { }

  submitOrder() {
    this.checkoutService.processCheckout(this.checkout).subscribe(response => {
      this.message = response;
    });
  }
}
