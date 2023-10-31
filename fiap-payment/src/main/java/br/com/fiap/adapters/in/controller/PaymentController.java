package br.com.fiap.adapters.in.controller;

import br.com.fiap.adapters.in.controller.request.PaymentRequest;
import br.com.fiap.adapters.infra.MercadoPagoPaymentService;
import br.com.fiap.application.core.service.PaymentService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Data
public class PaymentController {

	@Autowired
	private final PaymentService paymentService;

	private final MercadoPagoPaymentService mercadoPagoPaymentService;


	public PaymentController(PaymentService paymentService, MercadoPagoPaymentService mercadoPagoPaymentService) {
		this.paymentService = paymentService;
		this.mercadoPagoPaymentService = mercadoPagoPaymentService;
	}

	@PostMapping("/payments")
	public ResponseEntity<PaymentRequest> createPayment(@RequestBody PaymentRequest request) {
		try {
			PaymentRequest createdPayment = paymentService.createPayment(request.getAmount());
			return new ResponseEntity<>(createdPayment, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
//	@PostMapping("/generateQrCode")
//	public ResponseEntity<String> generateQrCode(@RequestBody PaymentRequest paymentRequest) {
//		String qrCodeLink = mercadoPagoPaymentService.generateQrCode(paymentRequest);
//
//		return ResponseEntity.ok(qrCodeLink);
//	}
}
