package br.com.fiap.adapters.out.repository.entity;

import br.com.fiap.application.core.domain.Customer;
import br.com.fiap.application.core.domain.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Table(name = "order")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class OrderEntity implements Serializable {

    @Id
    private Long id;
    private Customer customer;
    private Product product;
    private String orderDescription;
}
