package br.com.fiap.application.ports.in;

import br.com.fiap.adapters.in.controller.mapper.PaymentMapper;
import br.com.fiap.adapters.in.controller.request.PaymentRequest;
import br.com.fiap.adapters.out.repository.PaymentRepository;
import br.com.fiap.application.core.domain.model.Payment;
import br.com.fiap.application.core.service.PaymentService;

import java.math.BigDecimal;

public class PaymentUseCase implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final PaymentMapper paymentMapper;


    public PaymentUseCase(PaymentRepository paymentRepository, PaymentMapper paymentMapper) {
        this.paymentRepository = paymentRepository;
        this.paymentMapper = paymentMapper;
    }
    @Override
    public PaymentRequest createPayment(BigDecimal amount) {
        Payment payment = new Payment(amount);
        Payment savedPayment = paymentRepository.save(payment);

        return paymentMapper.paymentToPaymentRequest(savedPayment);
    }
}
