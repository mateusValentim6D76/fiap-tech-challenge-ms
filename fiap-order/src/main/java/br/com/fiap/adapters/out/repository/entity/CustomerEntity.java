package br.com.fiap.adapters.out.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class CustomerEntity {

    @Id
    private Long id;
    private String name;
    private String cpf;
    private String email;
    private Boolean isValidCpf;
}
