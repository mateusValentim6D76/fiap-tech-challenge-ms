package br.com.fiap.application.core.domain;




public class Customer {


    private String nameCustomer;
    private String cpf;
    private String email;
    private Boolean isValidCpf;

    public Customer() {
        this.isValidCpf = false;
    }

    public Customer(String nameCustomer, String cpf, String email, Boolean isValidCpf) {
        this.nameCustomer = nameCustomer;
        this.cpf = cpf;
        this.email = email;
        this.isValidCpf = isValidCpf;
    }

    public Customer(String nameCustomer, String cpf) {
        this.nameCustomer = nameCustomer;
        this.cpf = cpf;
    }

    public Customer(String cpf) {
        this.cpf = cpf;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
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
