package br.com.fiap.application.core.service;

import java.util.List;

import br.com.fiap.application.core.domain.Order;
import br.com.fiap.application.ports.in.IInsertOrderInputPort;
import br.com.fiap.application.ports.out.IFindAllOrdersOutputPort;
import br.com.fiap.application.ports.out.IInsertOrderOutputPort;

public class InsertOrderService implements IInsertOrderInputPort {

	private final IInsertOrderOutputPort iInsertOrderOutputPort;

	private final IFindAllOrdersOutputPort iFindAllOrdersOutputPort;

	public InsertOrderService(IInsertOrderOutputPort iInsertOrderOutputPort,
			IFindAllOrdersOutputPort iFindAllOrdersOutputPort) {
		this.iInsertOrderOutputPort = iInsertOrderOutputPort;
		this.iFindAllOrdersOutputPort = iFindAllOrdersOutputPort;
	}

	@Override
	public Order insert(Order order) {
		// order.setCustomer(customer);
		return iInsertOrderOutputPort.insertOrder(order);
	}

	@Override
	public List<Order> listAllOrders() {
		return iFindAllOrdersOutputPort.listAllOrders();
	}
}
