package com.example.james.structure.patterns.proxy.statics;

/**
 * 静态代理测试
 *
 * @author hz
 * @date 2020-1-7 17:52
 */
public class Test {

    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        buyHouse.buyHouse();
        //通过代理类实现买房
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHouse();
    }

}
