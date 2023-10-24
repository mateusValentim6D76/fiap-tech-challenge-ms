package br.com.fiap.adapters.in.controller.request;

import br.com.fiap.application.core.domain.enums.ProductType;
import lombok.Data;

@Data
public class ProductRequest {

	private String nameProduct;
	private String description;
	private Double price;
	private ProductType productType;
}
