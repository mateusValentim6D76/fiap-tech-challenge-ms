package br.com.fiap.application.core.domain;

import br.com.fiap.application.core.domain.enums.ProductType;

public class Order {

	private Long id;
	private ProductType productType;
	private String product;
	private String orderDescription;
	private Double price;
	private Customer customer;

	private OrderStatus ORDER_STATUS;
	
	public Order() {
		
	}

	public Order(ProductType productType, String product, String orderDescription, Double price, Customer customer) {
		this.productType = productType;
		this.product = product;
		this.orderDescription = orderDescription;
		this.price = price;
		this.ORDER_STATUS = OrderStatus.RECEIVED;
		this.customer = customer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderDescription() {
		return orderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public OrderStatus getORDER_STATUS() {
		return ORDER_STATUS;
	}

	public void setORDER_STATUS(OrderStatus ORDER_STATUS) {
		this.ORDER_STATUS = ORDER_STATUS;
	}
}
