import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Checkout } from '../Product_model/Checkout-model';

@Injectable({
  providedIn: 'root'
})
export class CheckoutService {

  

  private apiUrl = 'http://localhost:9002/api/checkout';

  constructor(private http: HttpClient) { }

  processCheckout(checkout: Checkout): Observable<string> {
    return this.http.post<string>(`${this.apiUrl}/process`, checkout, { responseType: 'text' as 'json' });
  }
  
}
