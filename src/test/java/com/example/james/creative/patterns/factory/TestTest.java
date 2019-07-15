package com.example.james.creative.patterns.factory;

import org.junit.Test;


/**
 * @author hz
 * @date 2019-6-24 19:37
 */
public class TestTest {

    @Test
    public void factoryTest() throws Exception {
        CarFactory benz = (CarFactory) Class.forName("com.example.james.creative.patterns.factory.BenzFactory").newInstance();
        String brand = benz.product().getBrand();

        CarFactory bmw = (CarFactory) Class.forName("com.example.james.creative.patterns.factory.BmwFactory").newInstance();
        String brand1 = bmw.product().getBrand();
        System.out.println(brand + "||||" + brand1);
    }

}