package br.com.fiap;

import com.mercadopago.MercadoPago;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.fiap.application.core.service")
@ComponentScan("br.com.fiap.adapters.in.controller.request")
@ComponentScan("br.com.fiap.adapters.in.controller.mapper")
@ComponentScan("br.com.fiap.adapters.out.repository")
public class FiapPayment implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FiapPayment.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        MercadoPago.SDK.setAccessToken(System.getenv(""));
    }
}