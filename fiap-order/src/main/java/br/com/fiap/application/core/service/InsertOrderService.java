package br.com.fiap.application.core.service;

import br.com.fiap.application.core.domain.Order;
import br.com.fiap.application.ports.in.IInsertOrderInputPort;
import br.com.fiap.application.ports.out.IInsertOrderOutputPort;

public class InsertOrderService implements IInsertOrderInputPort {

	private final IInsertOrderOutputPort iInsertOrderOutputPort;

	public InsertOrderService(IInsertOrderOutputPort iInsertOrderOutputPort) {
		this.iInsertOrderOutputPort = iInsertOrderOutputPort;
	}

	@Override
	public Order insert(Order order) {
		// order.setCustomer(customer);
		return iInsertOrderOutputPort.insertOrder(order);
	}

}
