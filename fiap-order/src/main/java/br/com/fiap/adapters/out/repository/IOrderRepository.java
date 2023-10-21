package br.com.fiap.adapters.out.repository;

import br.com.fiap.adapters.out.repository.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IOrderRepository extends JpaRepository<OrderEntity, Long> {
}
