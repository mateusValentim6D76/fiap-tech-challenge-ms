package br.com.fiap.application.ports.out;

import java.util.List;

import br.com.fiap.application.core.domain.Customer;
import br.com.fiap.application.core.domain.Order;

public interface IInsertOrderOutputPort  {
	
	Order insertOrder(Order order);
	
}
