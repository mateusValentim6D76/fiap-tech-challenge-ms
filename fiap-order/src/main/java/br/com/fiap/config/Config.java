package br.com.fiap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import br.com.fiap.adapters.out.InsertOrderAdapter;
import br.com.fiap.application.core.service.InsertOrderService;

@Component
public class Config {
	
	 @Bean
		public InsertOrderService insertOrderService(InsertOrderAdapter insertOrderAdapter){
			return new InsertOrderService(insertOrderAdapter);
		}
	

}
