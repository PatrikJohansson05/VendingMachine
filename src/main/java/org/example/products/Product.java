package org.example.products;

public abstract class Product {

    private String name;
    private int price;
    private int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Product(String name, int price, int calories){
        this.name = name;
        this.price = price;
        this.calories = calories;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    abstract String examine();

    public Product purchase(int money){
        if(getPrice() > money) {
            return null;
        }else {
            return this;
        }
    }
    abstract void use();
}
