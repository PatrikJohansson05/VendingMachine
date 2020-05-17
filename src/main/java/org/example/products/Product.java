package org.example.products;

public abstract class Product {

    private String name;
    private int price;
    private int calories;
    private int productNumber;


    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Product(String name, int price, int calories, int productNumber) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.productNumber = productNumber;
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

    public String examine(){ //couldn't get examine to work without making it public, find way to fix later to have individual examines.
        return getName() + " " + getCalories() + " " + getPrice();
    }

    public Product purchase(int money){
        if(getPrice() > money) {
            return null;
        }else {
            return this;
        }
    }
    abstract void use();

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }
}
