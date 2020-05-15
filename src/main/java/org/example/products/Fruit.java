package org.example.products;

public class Fruit extends Product{

    public Fruit(String name, int price, int calories) {
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
