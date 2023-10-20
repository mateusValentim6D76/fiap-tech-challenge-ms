package br.com.fiap.application.core.domain;

import lombok.Getter;

public class Customer {

    private Long id;
    private String name;
    private String cpf;
    private String email;
    private Boolean isValidCpf;

    public Customer() {
        this.isValidCpf = false;
    }

    public Customer(String name, String cpf, String email, Boolean isValidCpf) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.isValidCpf = isValidCpf;
    }

    public Customer(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public Customer(String cpf) {
        this.cpf = cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }
}
