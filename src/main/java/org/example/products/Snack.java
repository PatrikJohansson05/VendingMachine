package org.example.products;

public class Snack extends Product {


    public Snack(String name, int price, int calories) {
        super(name, price, calories);
    }
    @Override
    String examine() {
        return getName() + " " + getCalories() + " " + getPrice();
    }
    @Override
    public void use() {
        System.out.println("You eat a delicious " + getName() + "!");
    }
}

