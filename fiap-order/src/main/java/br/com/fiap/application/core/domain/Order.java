package br.com.fiap.application.core.domain;

public class Order {
    public Order(){
        
    }
    public Order(Long id, Customer customer, String orderDescription) {
        this.id = id;
        this.customer = customer;
        this.orderDescription = orderDescription;
    }

    private Long id;
    private Customer customer;
    private String orderDescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }
}
