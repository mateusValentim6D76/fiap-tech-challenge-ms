package br.com.fiap.adapters.in.controller.request;

import br.com.fiap.application.core.domain.Customer;
import br.com.fiap.application.core.domain.Product;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class OrderRequest {

    private Customer customer;
    @NotBlank
    private Product product;
    private String orderDescription;
}
