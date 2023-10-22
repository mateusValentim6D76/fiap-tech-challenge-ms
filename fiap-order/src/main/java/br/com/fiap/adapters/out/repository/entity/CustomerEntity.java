package br.com.fiap.adapters.out.repository.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerEntity {

    private String nameCustomer;
    private String cpf;
    private String email;
    private Boolean isValidCpf;
}
