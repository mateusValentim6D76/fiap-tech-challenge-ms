package br.com.fiap.adapters.in.controller.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import br.com.fiap.adapters.out.repository.entity.OrderEntity;
import br.com.fiap.application.core.domain.Order;

@Mapper(componentModel = "spring")
@Component
public interface OrderEntityMapper {
	OrderEntity toOrderEntity(Order order);
	Order toOrder(OrderEntity orderEntity);
}
