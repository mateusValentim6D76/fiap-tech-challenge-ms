package br.com.fiap.adapters.out.repository.entity;

import br.com.fiap.application.core.domain.enums.ProductType;
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
	
	private static final long serialVersionUID = -1989279167854870348L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private ProductType productType;
	private String product;
	private String orderDescription;
	private Double price;
}
