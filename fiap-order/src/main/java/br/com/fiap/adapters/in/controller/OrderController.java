package br.com.fiap.adapters.in.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.adapters.in.controller.mapper.OrderRequestToOrderMapper;
import br.com.fiap.adapters.in.controller.request.OrderRequest;
import br.com.fiap.application.core.domain.Order;
import br.com.fiap.application.ports.in.IInsertOrderInputPort;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/order")
public class OrderController {

	private final IInsertOrderInputPort iInsertOrderInputPort;

    private final OrderRequestToOrderMapper orderRequestToOrderMapper;

    @PostMapping
    public Order salvarUsuario(@RequestBody OrderRequest orderRequest){
        var order = orderRequestToOrderMapper.orderMapper(orderRequest);
        return iInsertOrderInputPort.insert(order);
    }
}
