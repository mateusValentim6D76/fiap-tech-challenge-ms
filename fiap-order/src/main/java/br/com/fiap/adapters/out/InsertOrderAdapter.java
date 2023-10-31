package br.com.fiap.adapters.out;


import org.springframework.stereotype.Component;

import br.com.fiap.adapters.in.controller.mapper.OrderEntityToOrderMapper;
import br.com.fiap.adapters.in.controller.mapper.OrderToEntityMapper;
import br.com.fiap.adapters.out.repository.IOrderRepository;
import br.com.fiap.application.core.domain.Order;
import br.com.fiap.application.ports.out.IInsertOrderOutputPort;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class InsertOrderAdapter implements IInsertOrderOutputPort {

	private final IOrderRepository iOrderRepository;

	private final OrderToEntityMapper orderEntityMapper;

	private final OrderEntityToOrderMapper orderEntityToOrderMapper;

	@Override
	@Transactional
	public Order insertOrder(Order order) {
		var orderEntity = orderEntityMapper.mapper(order);
		orderEntity.setOrderDescription(order.getOrderDescription());
		return orderEntityToOrderMapper.mapper(iOrderRepository.save(orderEntity));
	}
}