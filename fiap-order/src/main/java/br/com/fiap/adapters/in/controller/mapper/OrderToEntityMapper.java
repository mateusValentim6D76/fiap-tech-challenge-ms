package br.com.fiap.adapters.in.controller.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import br.com.fiap.adapters.out.repository.entity.OrderEntity;
import br.com.fiap.application.core.domain.Order;

@Component
public class OrderToEntityMapper {

    public OrderEntity mapper(Order order){
        var orderEntity = new OrderEntity();
        BeanUtils.copyProperties(order, orderEntity);
        return orderEntity;
   }

}