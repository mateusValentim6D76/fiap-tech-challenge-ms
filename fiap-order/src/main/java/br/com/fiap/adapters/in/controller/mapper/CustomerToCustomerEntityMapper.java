package br.com.fiap.adapters.in.controller.mapper;

import br.com.fiap.adapters.out.repository.entity.CustomerEntity;
import br.com.fiap.application.core.domain.Customer;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CustomerToCustomerEntityMapper {

    public CustomerEntity mapper(Customer customer){
        var customerEntity = new CustomerEntity();
        BeanUtils.copyProperties(customer, customerEntity);
        return customerEntity;
    }

}
