package br.com.fiap.adapters.out;

import br.com.fiap.adapters.out.repository.IOrderRepository;
import br.com.fiap.application.core.domain.Order;
import br.com.fiap.application.ports.out.IInsertOrderOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertOrderAdapter implements IInsertOrderOutputPort {
    @Autowired
    IOrderRepository iOrderRepository;
    @Override
    public void insertOrder(Order order) {
    //iOrderRepository.save();
    }
}
