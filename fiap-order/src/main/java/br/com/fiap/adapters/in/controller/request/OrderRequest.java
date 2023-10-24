package br.com.fiap.adapters.in.controller.request;

import br.com.fiap.application.core.domain.enums.ProductType;
import lombok.Data;

@Data
public class OrderRequest {

    private ProductType productType;
	private String product;
    private String orderDescription;
    private Double price;
}
