package br.com.fiap.adapters.in.controller.mapper;

import br.com.fiap.adapters.in.controller.request.PaymentRequest;
import br.com.fiap.application.core.domain.model.Payment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PaymentMapper {

    PaymentRequest paymentToPaymentRequest(Payment payment);

    Payment paymentRequestToPayment(PaymentRequest paymentRequest);
}
