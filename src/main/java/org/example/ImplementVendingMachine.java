package org.example;

import org.example.products.Drink;
import org.example.products.Fruit;
import org.example.products.Product;
import org.example.products.Snack;

public class ImplementVendingMachine implements VendingMachine {
    private int moneyPool = 0;
    private int[] denominations = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};

    Product[] product = {
            new Drink("Coca Cola", 25, 139, "330 ml"),
            new Drink("Fanta Orange", 22, 165, "330 ml"),
            new Fruit("Apple", 12, 52),
            new Fruit("Pear", 15, 57),
            new Snack("Snickers Bar", 17, 280),
            new Snack("Mars bar", 17, 228),
    };


    public void addCurrency(int amount){
        int[] validMoney = denominations;
        for(int i = 0; i < validMoney.length; i++){
            if (amount == validMoney[i]){
                moneyPool += validMoney[i];
                System.out.println(validMoney[i] + " sek added.");
                break;
            }
        }
    }

    public int getBalance() {
        return moneyPool;
    }

    public Product request(int productNumber){
        Product bought = null;
        switch(productNumber){
            case 1:
                bought = product[0].purchase(moneyPool);
                break;
            case 2:
                bought = product[1].purchase(moneyPool);
                break;
            case 3:
                bought = product[2].purchase(moneyPool);
            case 4:
                bought = product[3].purchase(moneyPool);
            case 5:
                bought = product[4].purchase(moneyPool);
            case 6:
                bought = product[5].purchase(moneyPool);
        }

        if(bought != null) {
            moneyPool = moneyPool - bought.getPrice();
        }
        return bought;
    }

    public String[] getProducts() {
        return null;
        }
        
    public String getDescription(int productNumber){
        String description = product.toString();
        System.out.println(description);
        return description;
        }

    public int endSession(){
        return 0;
    }


}