package com.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.entities.Product;
import com.webapp.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductRepository repository;

	@GetMapping
	public Iterable<Product> read() {
		Iterable<Product> products = repository.findAll();
		return products;
	}

	@PostMapping
	public Product create(@RequestBody Product product)
	{
		return repository.save(product);
	}
	
}
