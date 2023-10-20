package br.com.fiap.adapters.in.controller.mapper;

import br.com.fiap.adapters.in.controller.request.OrderRequest;
import br.com.fiap.application.core.domain.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IOrderMapper {

    @Mapping(target = "id", ignore = true)
    Order toOrder(OrderRequest orderRequest);
}
