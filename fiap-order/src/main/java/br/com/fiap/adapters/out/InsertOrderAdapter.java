package br.com.fiap.adapters.out;

import br.com.fiap.adapters.out.repository.IOrderRepository;
import br.com.fiap.adapters.out.repository.mapper.IOrderEntityMapper;
import br.com.fiap.application.core.domain.Order;
import br.com.fiap.application.ports.out.IInsertOrderOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertOrderAdapter implements IInsertOrderOutputPort {
    @Autowired
    IOrderRepository iOrderRepository;
    @Autowired
    IOrderEntityMapper iOrderEntityMapper;

    @Override
    public void insertOrder(Order order) {
        /*
        Creating a mapper to transform the customer
        into a customerEntity to be able to persist in the base
         */
        var orderEntity = iOrderEntityMapper.toOrderEntity(order);
        iOrderRepository.save(orderEntity);
    }
}
