package br.com.fiap.adapters.in.controller.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import br.com.fiap.adapters.in.controller.request.CustomerRequest;
import br.com.fiap.application.core.domain.Customer;

@Component
public class CustomerRequestToCustomerMapper {
	 public Customer customerMapper(CustomerRequest customerRequest){
	        var customer = new Customer();
	        BeanUtils.copyProperties(customerRequest, customer);
	        return customer;
	    }
}
