package br.com.fiap.adapters.in.controller;

import br.com.fiap.adapters.in.controller.mapper.IOrderMapper;
import br.com.fiap.adapters.in.controller.request.OrderRequest;
import br.com.fiap.application.ports.in.IInsertOrderInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    private IInsertOrderInputPort iInsertOrderInputPort;

    @Autowired
    private IOrderMapper iOrderMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody OrderRequest orderRequest) {
        var orderMapper = iOrderMapper.toOrder(orderRequest);
        iInsertOrderInputPort.insert(orderMapper);
        return ResponseEntity.ok().build();
    }
}
