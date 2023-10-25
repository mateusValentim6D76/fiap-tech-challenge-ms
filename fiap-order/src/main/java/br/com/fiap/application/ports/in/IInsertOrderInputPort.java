package br.com.fiap.application.ports.in;

import java.util.List;

import br.com.fiap.application.core.domain.Order;

public interface IInsertOrderInputPort {

	List<Order> listAllOrders();
	Order insert(Order order);

}
