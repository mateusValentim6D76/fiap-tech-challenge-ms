package br.com.fiap.adapters.in.controller.request;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PaymentRequest {

    private Long id;
    private BigDecimal amount;
    private LocalDateTime createdAt;
    private String qrCodeLink;
}
