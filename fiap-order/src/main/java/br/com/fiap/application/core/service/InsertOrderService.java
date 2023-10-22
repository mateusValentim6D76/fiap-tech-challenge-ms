package br.com.fiap.application.core.service;

import br.com.fiap.application.core.domain.Customer;
import br.com.fiap.application.core.domain.Order;
import br.com.fiap.application.core.domain.Product;
import br.com.fiap.application.core.domain.enums.ProductType;
import br.com.fiap.application.ports.in.IInsertOrderInputPort;
import br.com.fiap.application.ports.out.IInsertOrderOutputPort;

public class InsertOrderService implements IInsertOrderInputPort {

    private final IInsertOrderOutputPort iInsertOrderOutputPort;

    public InsertOrderService(IInsertOrderOutputPort iInsertOrderOutputPort) {
        this.iInsertOrderOutputPort = iInsertOrderOutputPort;
    }

    @Override
    public Order insert(Order order){
        var customer = new Customer();
        var product = new Product();
       
        product.setNameProduct(product.getNameProduct());
        product.setDescription(product.getDescription());
        product.setPrice(product.getPrice());
        product.setProductType(ProductType.SNACK);
        order.setCustomer(customer);
        order.setProduct(product);

       return iInsertOrderOutputPort.insertOrder(order);
    }
}
