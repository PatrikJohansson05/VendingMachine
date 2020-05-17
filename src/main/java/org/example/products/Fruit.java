package org.example.products;

public class Fruit extends Product{

    public Fruit(String name, int price, int calories, int productNumber) {
        super(name, price, calories, productNumber);
    }
    @Override
    public void use() {
        System.out.println("You eat a delicious " + getName() + "!");
    }
}
