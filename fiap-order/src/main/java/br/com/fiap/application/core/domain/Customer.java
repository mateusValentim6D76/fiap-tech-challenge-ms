package br.com.fiap.application.core.domain;

import lombok.Getter;

public class Customer {

    private Long id;
    private String name;

    private String cpf;

    private Boolean isValidCpf;

    public Customer(){
        this.isValidCpf = false;
    }
    public Customer(String name, String cpf, Boolean isValidCpf) {
        this.name = name;
        this.cpf = cpf;
        this.isValidCpf = isValidCpf;
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
    public Boolean getValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }
}
