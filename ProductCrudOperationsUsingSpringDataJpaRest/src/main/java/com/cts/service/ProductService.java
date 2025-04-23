package com.cts.service;

import java.util.List;

import com.cts.exceptions.ProductNotFound;
import com.cts.model.Product;

public interface ProductService {

	public abstract String saveProduct(Product product);

	public abstract Product updateProduct(Product product);

	public abstract String removeProduct(int productId);

	public abstract Product getProduct(int productId) throws ProductNotFound;

	public abstract List<Product> getAllProducts();

	public abstract List<Product> findByProductPriceBetween(int initialPrice, int finalPrice);

	public abstract List<Product> findByProductCategory(String category);

	public abstract List<Product> findByProductPriceGreaterThan(int price);
}
