package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Product1;
import com.example.Reposotory.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productrepo;
	
	public List<Product1> getAllProducts(){
		return productrepo.findAll();
	}
	
	public String postProduct(Product1 product) {
		productrepo.save(product);
		return "Saved";
	}
	
	public Product1 getByProductId(Long id) {
		return productrepo.findById(id).get();
	}
}
