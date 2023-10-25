package br.com.fiap.adapters.out;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.fiap.adapters.in.controller.mapper.OrderEntityToOrderMapper;
import br.com.fiap.adapters.in.controller.mapper.OrderToEntityMapper;
import br.com.fiap.adapters.out.repository.IOrderRepository;
import br.com.fiap.adapters.out.repository.entity.OrderEntity;
import br.com.fiap.application.core.domain.Order;
import br.com.fiap.application.ports.out.IFindAllOrdersOutputPort;
import br.com.fiap.application.ports.out.IInsertOrderOutputPort;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class FindAllOrderAdapter implements IFindAllOrdersOutputPort {

	private final IOrderRepository iOrderRepository;

	private final OrderToEntityMapper orderEntityMapper;

	private final OrderEntityToOrderMapper orderEntityToOrderMapper;

	@Override
	public List<Order> listAllOrders() {
		List<OrderEntity> ordersEntities = iOrderRepository.findAll();
		List<Order> orders = new ArrayList<>();
		for (OrderEntity orderEntity : ordersEntities) {
			orders.add(orderEntityToOrderMapper.mapper(orderEntity));
		}
		return orders;
	}
}