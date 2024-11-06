package com.example.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.PaymentRequest;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

	    @PostMapping("/process")
	    public ResponseEntity<String> processPayment(@RequestBody PaymentRequest paymentRequest) {
	        // Mock payment processing logic
	        if (paymentRequest.getAmount() > 0) {
	            return ResponseEntity.ok("Payment Successful");
	        } else {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Payment Failed");
	        }
	    }
	}


