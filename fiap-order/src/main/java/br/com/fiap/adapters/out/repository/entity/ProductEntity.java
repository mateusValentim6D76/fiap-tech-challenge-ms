package br.com.fiap.adapters.out.repository.entity;

import br.com.fiap.application.core.domain.ComboSelection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Table(name = "product")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ProductEntity {

    @Id
    private Long id;
    private String name;
    private String description;
    private Double price;
    private ComboSelection comboSelection;
}
