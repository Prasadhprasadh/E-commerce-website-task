import { Component } from '@angular/core';
import { Payment } from 'src/app/Product_model/Payment';
import { PaymentserviceService } from 'src/app/Service/paymentservice.service';

@Component({
  selector: 'app-payment-status',
  templateUrl: './payment-status.component.html',
  styleUrls: ['./payment-status.component.css']
})
export class PaymentStatusComponent {

  payment: Payment = new Payment();
  message: string = '';

  constructor(private paymentService: PaymentserviceService) { }

  submitPayment() {
    this.paymentService.processPayment(this.payment).subscribe(response => {
      this.message = response;
    });
  }

}
