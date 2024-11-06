package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.CheckOut;
import com.example.Reposotory.CheckoutRepo;

@Service
public class CheckOutService {

	 @Autowired
	    private CheckoutRepo checkoutrepo;

	    public CheckOut saveCheckout(CheckOut checkout) {
	        return checkoutrepo.save(checkout);
	    }
}
