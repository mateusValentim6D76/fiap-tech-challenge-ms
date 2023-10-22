package br.com.fiap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.fiap.adapters.in.controller.OrderController;

@SpringBootApplication
@ComponentScan("br.com.fiap.application.core.usecase;")
@ComponentScan(basePackageClasses = OrderController.class)
public class FiapOrder {
    public static void main(String[] args) {
      SpringApplication.run(FiapOrder.class, args);
    }
}