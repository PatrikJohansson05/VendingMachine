package org.example.products;

public class Snack extends Product {


    public Snack(String name, int price, int calories, int productNumber) {
        super(name, price, calories, productNumber);
    }

    @Override
    public void use() {
        System.out.println("You eat a delicious " + getName() + "!");
    }
}

