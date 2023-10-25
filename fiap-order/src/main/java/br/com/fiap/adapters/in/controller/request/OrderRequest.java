package br.com.fiap.adapters.in.controller.request;

import br.com.fiap.application.core.domain.Customer;
import br.com.fiap.application.core.domain.enums.ProductType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class OrderRequest {

	@NotNull
    private ProductType productType;
	@NotBlank
	private String product;
    private String orderDescription;
    @NotNull
    private Double price;
    @Valid
    @NotNull
    private Customer customer;
}
