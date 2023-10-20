package br.com.fiap.adapters.out.repository.entity;

import br.com.fiap.application.core.domain.ComboSelection;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class ProductEntity {

    @Id
    private Long id;
    private String name;
    private String description;
    private Double price;
    private ComboSelection comboSelection;
}
