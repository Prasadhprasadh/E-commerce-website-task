package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Product1;
import com.example.Service.ProductService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/products")
public class ProductController {

	@Autowired
	private ProductService productservice;
	
	@GetMapping("getall")
	public List<Product1> getAllProducts(){
		return productservice.getAllProducts();
	}
	
	
	@PostMapping("/post")
	public String postProduct(@RequestBody Product1 product) {
		productservice.postProduct(product);
		return "Posted Sucessfully";
	}
	
	@GetMapping("/getbyproductid/{id}")
	public Product1 getByProductId(@PathVariable Long id) {
		return productservice.getByProductId(id);
	}
}
