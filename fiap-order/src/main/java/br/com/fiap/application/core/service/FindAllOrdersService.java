package br.com.fiap.application.core.service;

import java.util.List;

import br.com.fiap.application.core.domain.Order;
import br.com.fiap.application.ports.in.IFindAllOrdersInputPort;
import br.com.fiap.application.ports.out.IFindAllOrdersOutputPort;

public class FindAllOrdersService implements IFindAllOrdersInputPort {


	private final IFindAllOrdersOutputPort iFindAllOrdersOutputPort;

	public FindAllOrdersService(
			IFindAllOrdersOutputPort iFindAllOrdersOutputPort) {
		this.iFindAllOrdersOutputPort = iFindAllOrdersOutputPort;
	}

	@Override
	public List<Order> listAllOrders() {
		return iFindAllOrdersOutputPort.listAllOrders();
	}
}
