package br.com.fiap.application.core.domain;

public class Order {

    public Order() {

    }
    public Order(Customer customer, Product product, String orderDescription) {
        this.id = id;
        this.customer = customer;
        this.product = product;
        this.orderDescription = orderDescription;
    }

    public Order(Customer customer, Product product) {
        this.id = id;
        this.customer = customer;
        this.product = product;
    }

    public Order(Product product) {
        this.id = id;
        this.product = product;
    }
    private Long id;
    private Customer customer;
    private Product product;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
