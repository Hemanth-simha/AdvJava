package com.jspiders.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.jspiders.springboot.entities.Product;
import com.jspiders.springboot.repository.ProductRepository;

@SpringBootTest
class SpringbootApplicationTests {

	@Autowired
	ApplicationContext context;
	
	@Test
	void saveProduct() {
		
		Product product = new Product();
		product.setId(101);
		product.setName("Iphone");
		product.setDescription("Wow!");
		product.setPrice(40000.40);
		
		ProductRepository repository = context.getBean(ProductRepository.class);
		repository.save(product);
		
	}

}
