package br.com.fiap.application.ports.out;

import br.com.fiap.application.core.domain.Order;

public interface IInsertOrderOutputPort {
    Order insertOrder(Order order);
}
