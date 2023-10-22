package br.com.fiap.adapters.out.repository.entity;

import br.com.fiap.application.core.domain.enums.ProductType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {
	
	private String nameProduct;
	private String description;
	private Double price;
	@Enumerated(EnumType.STRING)
	private ProductType productType;
}
