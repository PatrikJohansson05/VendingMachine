package org.example;

import static org.junit.Assert.assertTrue;

import org.example.products.Product;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    VendingMachine vendingMachine = new ImplementVendingMachine();


    @Test
    public void test_addCurrency(){
        vendingMachine.addCurrency(5);
        vendingMachine.addCurrency(2);
        Assert.assertEquals(7, vendingMachine.getBalance());
    }
    @Test
    public void test_addCurrency_wrong_denomination(){
        vendingMachine.addCurrency(3);
        Assert.assertEquals(0, vendingMachine.getBalance());
    }

    @Test
    public void test_request(){
        vendingMachine.addCurrency(38);
        vendingMachine.request(1);
        vendingMachine.request(3);
        Assert.assertEquals(1, vendingMachine.getBalance());
    }



    @After
    public void tearDown() throws Exception{
        vendingMachine.endSession();
    }
}
