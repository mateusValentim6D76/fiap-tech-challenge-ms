package br.com.fiap.adapters.infra;

import br.com.fiap.adapters.in.controller.mapper.PaymentMapper;
import br.com.fiap.adapters.in.controller.request.PaymentRequest;
import br.com.fiap.adapters.out.repository.PaymentRepository;
import br.com.fiap.application.core.domain.model.Payment;
import br.com.fiap.application.core.service.PaymentService;
import com.mercadopago.resources.Preference;
import com.mercadopago.resources.datastructures.payment.Item;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@Primary
public class MercadoPagoPaymentService implements PaymentService {
    private MercadoPagoClient mercadoPagoClient;
    private PaymentRepository paymentRepository;
    private PaymentMapper paymentMapper;

    public MercadoPagoPaymentService(MercadoPagoClient mercadoPagoClient, PaymentRepository paymentRepository, PaymentMapper paymentMapper) {
        this.mercadoPagoClient = mercadoPagoClient;
        this.paymentRepository = paymentRepository;
        this.paymentMapper = paymentMapper;
    }

    public MercadoPagoPaymentService() {

    }

    @Override
    public PaymentRequest createPayment(BigDecimal amount) {
        String paymentId = UUID.randomUUID().toString();

        String qrCodeLink = mercadoPagoClient.createPreference(UUID.fromString(paymentId), "http://localhost:8081/", amount);

        Payment payment = new Payment(amount);
        payment.setId(payment.getId());
        payment.setAmount(payment.getAmount());
        payment.setCreatedAt(LocalDateTime.now());
        payment.setQrCodeLink(qrCodeLink);

        Payment savedPayment = paymentRepository.save(payment);

        return paymentMapper.paymentToPaymentRequest(savedPayment);
    }
}


