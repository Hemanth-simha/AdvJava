package com.webapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.webapp.entities.Product;
import com.webapp.repository.ProductRepository;

@SpringBootTest
class WebappApplicationTests {

	@Autowired
	ApplicationContext context = null;
	
	@Test
	void saveProduct() {
		
		Product product = new Product();
		product.setId(101);
		product.setName("Iphone");
		product.setDescription("Wow!");
		product.setPrice(40446.44);
		
		
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		productRepository.save(product);
		
	}

}
