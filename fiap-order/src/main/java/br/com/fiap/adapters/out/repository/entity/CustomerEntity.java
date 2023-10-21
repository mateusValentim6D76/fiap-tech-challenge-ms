package br.com.fiap.adapters.out.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Table(name = "customer")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class CustomerEntity {

    @Id
    private Long id;
    private String name;
    private String cpf;
    private String email;
    private Boolean isValidCpf;
}
