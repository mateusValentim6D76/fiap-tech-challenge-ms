package br.com.fiap.application.ports.in;

import br.com.fiap.application.core.domain.Order;

public interface IInsertOrderInputPort  {

    void insert(Order order);
}
