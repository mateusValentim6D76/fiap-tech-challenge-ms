package br.com.fiap.application.core.domain;

import br.com.fiap.application.core.domain.enums.ProductType;

public class Product {
	
	public Product(String name, String description, Double price, ProductType productType) {
		this.nameProduct = name;
		this.description = description;
		this.price = price;
		this.productType = productType;
	}

	public Product(String name, Double price, ProductType productType) {
		this.nameProduct = name;
		this.price = price;
		this.productType = productType;
	}

	public Product() {

	}

	private String nameProduct;
	private String description;
	private Double price;
	private ProductType productType;

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String name) {
		this.nameProduct = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	

}
