package br.com.fiap.application.ports.in;

import br.com.fiap.application.core.domain.Customer;
import br.com.fiap.application.core.domain.Order;

public interface IInsertOrderInputPort {

	Order insert(Order order);

}
