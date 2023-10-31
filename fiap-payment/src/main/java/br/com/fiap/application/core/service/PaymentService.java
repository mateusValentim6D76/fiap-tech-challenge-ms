package br.com.fiap.application.core.service;

import br.com.fiap.adapters.in.controller.request.PaymentRequest;
import br.com.fiap.application.core.domain.model.Payment;

import java.math.BigDecimal;

public interface PaymentService {
	PaymentRequest createPayment(BigDecimal amount);


}
