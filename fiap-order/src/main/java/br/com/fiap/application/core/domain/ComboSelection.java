package br.com.fiap.application.core.domain;

public class ComboSelection {
    public ComboSelection(Product snack, Product drink, Product sideDishes) {
        this.snack = snack;
        this.drink = drink;
        this.sideDishes = sideDishes;
    }

    public ComboSelection(Product snack, Product drink) {
        this.snack = snack;
        this.drink = drink;
    }

    public ComboSelection(Product snack) {
        this.snack = snack;
    }

    public ComboSelection() {

    }

    private Product snack;
    private Product drink;
    private Product sideDishes;

    public Product getSnack() {
        return snack;
    }

    public void setSnack(Product snack) {
        this.snack = snack;
    }

    public Product getDrink() {
        return drink;
    }

    public void setDrink(Product drink) {
        this.drink = drink;
    }

    public Product getSideDishes() {
        return sideDishes;
    }

    public void setSideDishes(Product sideDishes) {
        this.sideDishes = sideDishes;
    }
}
