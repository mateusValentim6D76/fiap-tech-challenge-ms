package br.com.fiap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.fiap.adapters.in.controller.OrderController;

@SpringBootApplication
@ComponentScan("br.com.fiap.application.core.service")
@ComponentScan(basePackageClasses = OrderController.class)
@ComponentScan("br.com.fiap.adapters.in.controller.request")
@ComponentScan("br.com.fiap.adapters.in.controller.mapper")
public class FiapOrder {
    public static void main(String[] args) {
      SpringApplication.run(FiapOrder.class, args);
    }
}