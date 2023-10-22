package br.com.fiap.adapters.out.repository.entity;

import br.com.fiap.application.core.domain.Customer;
import br.com.fiap.application.core.domain.Product;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Table(name = "orders")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class OrderEntity implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private Customer customer;
    @Embedded
    private Product product;
    private String orderDescription;
}
