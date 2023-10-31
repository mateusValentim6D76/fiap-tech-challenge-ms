package br.com.fiap.adapters.in.controller.request;

import jakarta.validation.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {

	private String nameCustomer;
	@NotNull
	@CPF
	private String cpf;
	@Email
	private String email;
	private Boolean isValidCpf;
}
