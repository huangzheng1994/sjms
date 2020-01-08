package com.example.james.creative.patterns.factory;

import java.util.*;

/**
 * 工厂方法测试
 *
 * @author hz
 * @date 2019-2-14 11:01
 */
public class Test {

    /**
     * 描述: 测试
     *
     * @param
     * @return
     * @auther: hz
     * @date: 2019-2-14 11:03
     */
    public void factoryTest() throws Exception {
//        CarFactory benz = new BenzFactory();
        CarFactory benz = (CarFactory) Class.forName("com.example.james.creative.patterns.factory.BenzFactory").newInstance();
        String brand = benz.product().getBrand();

//        CarFactory bmw = new BmwFactory();
        CarFactory bmw = (CarFactory) Class.forName("com.example.james.creative.patterns.factory.BmwFactory").newInstance();
        String brand1 = bmw.product().getBrand();
    }

}
