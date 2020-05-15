package org.example.products;

public class Drink extends Product {

    private String volume;

    public Drink(String name, int price, int calories, String volume){
        super(name, price, calories);
        this.volume = volume;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
    @Override
    String examine() {
        return getName() + " " + getVolume() + " " + getCalories() + " " + getPrice();
    }
    @Override
    public void use() {
        System.out.println("You drink a refreshing " + getName() + "!");
    }
}
