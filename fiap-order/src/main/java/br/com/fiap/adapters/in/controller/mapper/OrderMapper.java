package br.com.fiap.adapters.in.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.fiap.adapters.in.controller.request.OrderRequest;
import br.com.fiap.application.core.domain.Order;

@Mapper(componentModel = "spring")
public interface OrderMapper {
	@Mapping(target = "id", ignore = true)
	@Mapping(target = "isValidCpf", ignore = true)
	Order toOrder(OrderRequest orderRequest);

}
