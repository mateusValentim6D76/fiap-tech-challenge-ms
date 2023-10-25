package br.com.fiap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.adapters.out.FindAllOrderAdapter;
import br.com.fiap.adapters.out.InsertOrderAdapter;
import br.com.fiap.application.core.service.FindAllOrdersService;
import br.com.fiap.application.core.service.InsertOrderService;

@Configuration
public class Config {

	@Bean
	public InsertOrderService insertOrderService(InsertOrderAdapter insertOrderAdapter) {
		return new InsertOrderService(insertOrderAdapter);
	}

	@Bean
	public FindAllOrdersService findAllOrders(FindAllOrderAdapter findAllOrderAdapter) {
		return new FindAllOrdersService(findAllOrderAdapter);
	}

}