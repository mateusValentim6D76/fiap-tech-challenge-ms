package br.com.fiap.adapters.in.controller.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import br.com.fiap.adapters.in.controller.request.OrderRequest;
import br.com.fiap.application.core.domain.Order;


@Component
public class OrderRequestToOrderMapper {
	
	  public Order orderMapper(OrderRequest orderRequest){
	        var order = new Order();
	        BeanUtils.copyProperties(orderRequest, order);
	        return order;
	    }

}
