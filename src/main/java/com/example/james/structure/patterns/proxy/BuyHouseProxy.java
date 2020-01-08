package com.example.james.structure.patterns.proxy;

/**
 * @author hz
 * @date 2020-1-8 10:38
 */
public class BuyHouseProxy implements BuyHouse {

    private final BuyHouse buyHouse;

    public BuyHouseProxy(final BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }


    @Override
    public void buyHouse() {
        System.out.println("买房前准备");
        buyHouse.buyHouse();
        System.out.println("买房后装修");
    }
}
