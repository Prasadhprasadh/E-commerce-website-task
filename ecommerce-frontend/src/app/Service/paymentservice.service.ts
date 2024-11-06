import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Payment } from '../Product_model/Payment';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PaymentserviceService {

  private apiUrl = 'http://localhost:9002/api/payment';

  constructor(private http: HttpClient) { }

  processPayment(payment: Payment): Observable<string> {
    return this.http.post<string>(`${this.apiUrl}/process`, payment);
  }
}
