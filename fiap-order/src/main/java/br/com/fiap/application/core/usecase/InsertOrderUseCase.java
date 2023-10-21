package br.com.fiap.application.core.usecase;

import br.com.fiap.application.core.domain.ComboSelection;
import br.com.fiap.application.core.domain.Customer;
import br.com.fiap.application.core.domain.Order;
import br.com.fiap.application.core.domain.Product;
import br.com.fiap.application.ports.in.IInsertOrderInputPort;
import br.com.fiap.application.ports.out.IInsertOrderOutputPort;
import org.springframework.stereotype.Component;

public class InsertOrderUseCase implements IInsertOrderInputPort {

    private final IInsertOrderOutputPort iInsertOrderOutputPort;

    public InsertOrderUseCase(IInsertOrderOutputPort iInsertOrderOutputPort) {
        this.iInsertOrderOutputPort = iInsertOrderOutputPort;
    }

    @Override
    public void insert(Order order){
        var customer = new Customer();
        var combo = new ComboSelection();

        customer.setName(customer.getName());
        combo.setSnack(combo.getSnack());
        combo.setDrink(combo.getDrink());

        var product = new Product();
        product.setName(product.getName());
        product.setDescription(product.getDescription());
        product.setPrice(product.getPrice());
        product.setComboSelection(combo);

        order.setCustomer(customer);
        order.setProduct(product);

        iInsertOrderOutputPort.insertOrder(order);
    }
}
