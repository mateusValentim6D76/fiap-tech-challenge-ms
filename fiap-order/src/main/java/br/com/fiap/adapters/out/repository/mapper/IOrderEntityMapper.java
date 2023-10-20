package br.com.fiap.adapters.out.repository.mapper;

import br.com.fiap.adapters.out.repository.entity.OrderEntity;
import br.com.fiap.application.core.domain.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IOrderEntityMapper  {

    OrderEntity toOrderEntity(Order order);
}
