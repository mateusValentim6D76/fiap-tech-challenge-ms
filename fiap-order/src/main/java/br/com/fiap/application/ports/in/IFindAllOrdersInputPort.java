package br.com.fiap.application.ports.in;

import java.util.List;

import br.com.fiap.application.core.domain.Order;

public interface IFindAllOrdersInputPort {

	List<Order> listAllOrders();

}
