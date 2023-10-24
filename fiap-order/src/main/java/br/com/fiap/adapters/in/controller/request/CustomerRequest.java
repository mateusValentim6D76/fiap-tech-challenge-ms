package br.com.fiap.adapters.in.controller.request;

import lombok.Data;

@Data
public class CustomerRequest {

	private String nameCustomer;
	private String cpf;
	private String email;
	private Boolean isValidCpf;
}
