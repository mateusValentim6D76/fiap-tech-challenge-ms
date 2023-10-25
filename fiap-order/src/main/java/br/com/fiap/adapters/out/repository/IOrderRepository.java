package br.com.fiap.adapters.out.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.adapters.out.repository.entity.OrderEntity;


public interface IOrderRepository extends JpaRepository<OrderEntity, Long> {

	
}
