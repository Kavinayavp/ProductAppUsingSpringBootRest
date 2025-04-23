package com.cts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Table(name = "products_info")
@AllArgsConstructor
@Data

public class Product {

	@Id
	@Column(name = "pid")
	@GeneratedValue
	private int productId;
	@NotBlank(message= "ProductName can't be NULL or Blank")
	private String productName;
	@Column(name = "price")
	@Min(value=100,message="ProductPrice must be above 100")
	@Max(value=10000,message="ProductPrice must be below 1 lakh")
	private int productPrice;
	@Size(min=5,max=12,message="Category length must be between (5,12)")
	private String productCategory;
	@Column(name = "quantity")
	@Positive(message="Quantity cannot be zero or -ve")
	private int productQuantity;
	public Product(String productName, int productPrice, String productCategory, int productQuantity) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
		this.productQuantity = productQuantity;
	}
	public Product() {
		
	}

}
