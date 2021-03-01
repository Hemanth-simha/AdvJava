package com.webapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.webapp.entities.Product;

public interface ProductRepository extends CrudRepository<Product,Integer>{

}
