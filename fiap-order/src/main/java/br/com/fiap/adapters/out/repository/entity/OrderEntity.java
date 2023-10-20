package br.com.fiap.adapters.out.repository.entity;

import br.com.fiap.application.core.domain.Customer;
import br.com.fiap.application.core.domain.Product;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@Table(name = "order")
@Builder
public class OrderEntity implements Serializable {

    @Id
    private Long id;
    private Customer customer;
    private Product product;
    private String orderDescription;
}
