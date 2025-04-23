package com.cts;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.model.Product;
import com.cts.repository.ProductRepository;
import com.cts.service.ProductServiceImpl;

@SpringBootTest
class ProductCrudOperationsUsingSpringJpaApplicationTests {
	@Mock
	ProductRepository repository;
@InjectMocks
	ProductServiceImpl service;
	
	@Test
	void saveProductTest() {
		Product product=new Product("samsung",22000,"electronics",15);
		Mockito.when(repository.save(product)).thenReturn(product);
		String response=service.saveProduct(product);
		assertEquals("Product Saved Successfully", response);
	}

}
