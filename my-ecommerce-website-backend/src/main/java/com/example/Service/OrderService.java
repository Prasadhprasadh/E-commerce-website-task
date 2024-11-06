package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Order1;
import com.example.Reposotory.OrderRepo;

@Service
public class OrderService {

	@Autowired
	private OrderRepo orderrepo;
	
	public Order1 createorder(Order1 order) {
		return orderrepo.save(order);
	}
	
	
	public List<Order1> getallorders(){
		return orderrepo.findAll();
	}
	
}
