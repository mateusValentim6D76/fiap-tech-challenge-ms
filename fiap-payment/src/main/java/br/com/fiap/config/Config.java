package br.com.fiap.config;

import br.com.fiap.adapters.in.controller.mapper.PaymentMapper;
import br.com.fiap.adapters.in.controller.request.PaymentRequest;
import br.com.fiap.adapters.infra.MercadoPagoClient;
import br.com.fiap.adapters.infra.MercadoPagoPaymentService;
import br.com.fiap.adapters.out.repository.PaymentRepository;
import br.com.fiap.application.core.domain.model.Payment;
import br.com.fiap.application.core.service.PaymentService;
import com.mercadopago.exceptions.MPConfException;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Configuration
public class Config {
	@Value("${mercadopago.api.key}")
	private String mercadoPagoApiKey;


	@Bean
	public MercadoPagoClient mercadoPagoClient() throws MPConfException {
		// Inicialize e configure o MercadoPagoClient conforme necessário
		return new MercadoPagoClient(mercadoPagoApiKey);
	}

	@Bean
	public PaymentRepository paymentRepository() {
		// Inicialize e configure o PaymentRepository conforme necessário
		return new PaymentRepository(){
			@Override
			public List<Payment> findAll(Sort sort) {
				return null;
			}

			@Override
			public Page<Payment> findAll(Pageable pageable) {
				return null;
			}

			@Override
			public <S extends Payment> S save(S entity) {
				return null;
			}

			@Override
			public <S extends Payment> List<S> saveAll(Iterable<S> entities) {
				return null;
			}

			@Override
			public Optional<Payment> findById(Long aLong) {
				return Optional.empty();
			}

			@Override
			public boolean existsById(Long aLong) {
				return false;
			}

			@Override
			public List<Payment> findAll() {
				return null;
			}

			@Override
			public List<Payment> findAllById(Iterable<Long> longs) {
				return null;
			}

			@Override
			public long count() {
				return 0;
			}

			@Override
			public void deleteById(Long aLong) {

			}

			@Override
			public void delete(Payment entity) {

			}

			@Override
			public void deleteAllById(Iterable<? extends Long> longs) {

			}

			@Override
			public void deleteAll(Iterable<? extends Payment> entities) {

			}

			@Override
			public void deleteAll() {

			}

			@Override
			public void flush() {

			}

			@Override
			public <S extends Payment> S saveAndFlush(S entity) {
				return null;
			}

			@Override
			public <S extends Payment> List<S> saveAllAndFlush(Iterable<S> entities) {
				return null;
			}

			@Override
			public void deleteAllInBatch(Iterable<Payment> entities) {

			}

			@Override
			public void deleteAllByIdInBatch(Iterable<Long> longs) {

			}

			@Override
			public void deleteAllInBatch() {

			}

			@Override
			public Payment getOne(Long aLong) {
				return null;
			}

			@Override
			public Payment getById(Long aLong) {
				return null;
			}

			@Override
			public Payment getReferenceById(Long aLong) {
				return null;
			}

			@Override
			public <S extends Payment> Optional<S> findOne(Example<S> example) {
				return Optional.empty();
			}

			@Override
			public <S extends Payment> List<S> findAll(Example<S> example) {
				return null;
			}

			@Override
			public <S extends Payment> List<S> findAll(Example<S> example, Sort sort) {
				return null;
			}

			@Override
			public <S extends Payment> Page<S> findAll(Example<S> example, Pageable pageable) {
				return null;
			}

			@Override
			public <S extends Payment> long count(Example<S> example) {
				return 0;
			}

			@Override
			public <S extends Payment> boolean exists(Example<S> example) {
				return false;
			}

			@Override
			public <S extends Payment, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
				return null;
			}
		};
	}
//	@Bean
//	public PaymentMapper paymentMapper() {
//		return Mappers.getMapper(PaymentMapper.class);
//	}

	@Bean
	public PaymentMapper paymentMapper() {
		// Inicialize e configure o PaymentMapper conforme necessário
		return new PaymentMapper() {
			@Override
			public PaymentRequest paymentToPaymentRequest(Payment payment) {
				return null;
			}

			@Override
			public Payment paymentRequestToPayment(PaymentRequest paymentRequest) {
				return null;
			}
		};
	}
	@Bean
	public MercadoPagoPaymentService mpPaymentService(MercadoPagoClient mercadoPagoClient, PaymentRepository paymentRepository, PaymentMapper paymentMapper) {
		return new MercadoPagoPaymentService(mercadoPagoClient, paymentRepository, paymentMapper);
	}
}