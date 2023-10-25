package br.com.fiap.adapters.in.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.adapters.in.controller.mapper.OrderMapper;
import br.com.fiap.adapters.in.controller.mapper.OrderRequestToOrderMapper;
import br.com.fiap.adapters.in.controller.request.OrderRequest;
import br.com.fiap.application.core.domain.Order;
import br.com.fiap.application.ports.in.IInsertOrderInputPort;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
@RequestMapping("/api/v1/order")
@Data
public class OrderController {

	@Autowired
	private IInsertOrderInputPort iInsertOrderInputPort;

	private final OrderRequestToOrderMapper orderRequestToOrderMapper;

	@PostMapping
	public Order insertOrder(@RequestBody OrderRequest orderRequest) {
		var order = orderRequestToOrderMapper.orderMapper(orderRequest);
		return iInsertOrderInputPort.insert(order);
	}

	@GetMapping
	public List<Order> listOrders() {
		return iInsertOrderInputPort.listAllOrders();
	}
}
