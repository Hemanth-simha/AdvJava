package com.jspiders.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.jspiders.springboot.entities.Product;

public interface ProductRepository extends CrudRepository<Product,Integer>{

}
