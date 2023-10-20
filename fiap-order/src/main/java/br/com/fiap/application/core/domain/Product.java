package br.com.fiap.application.core.domain;

public class Product {
    public Product(String name, String description, Double price, ComboSelection comboSelection) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.comboSelection = comboSelection;
    }
    public Product(String name, Double price, ComboSelection comboSelection) {
        this.name = name;
        this.price = price;
        this.comboSelection = comboSelection;
    }

    public Product() {

    }
    private Long id;
    private String name;
    private String description;
    private Double price;
    private ComboSelection comboSelection;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ComboSelection getComboSelection() {
        return comboSelection;
    }

    public void setComboSelection(ComboSelection comboSelection) {
        this.comboSelection = comboSelection;
    }
}
