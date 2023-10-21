package br.com.fiap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("br.com.fiap.application.core.usecase;")
public class FiapOrder {
    public static void main(String[] args) {
      SpringApplication.run(FiapOrder.class, args);
    }
}