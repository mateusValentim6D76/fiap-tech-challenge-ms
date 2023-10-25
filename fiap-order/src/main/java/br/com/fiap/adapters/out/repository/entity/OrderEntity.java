package br.com.fiap.adapters.out.repository.entity;

import br.com.fiap.application.core.domain.Customer;
import br.com.fiap.application.core.domain.enums.ProductType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "NEW_ORDERS")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class OrderEntity {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private ProductType productType;
	private String product;
	private String orderDescription;
	private Double price;
	@Embedded
	private Customer customer;

	public OrderEntity(ProductType productType, String product, String orderDescription, Double price,
			Customer customer) {
		this.productType = productType;
		this.product = product;
		this.orderDescription = orderDescription;
		this.price = price;
		this.customer = new Customer(customer.getNameCustomer());
	}

}
