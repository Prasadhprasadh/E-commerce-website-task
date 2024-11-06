package com.example.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.CheckOut;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/checkout")
public class CheckOutController {
	

	    @PostMapping("/process")
	    public ResponseEntity<String> processCheckout(@RequestBody CheckOut checkoutRequest) {
	        // Logic to process the order (e.g., save to database)
	        return ResponseEntity.ok("Order successfully placed!");
	    }
	}


