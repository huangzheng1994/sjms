package com.example.james.creative.patterns.factory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hz
 * @date 2019-2-14 11:10
 */
public class TestTest {

    @Test
    public void factoryTest() {
        DogFactory dogFactory = new DogFactory();
        System.out.println("狗狗的工厂方法: " + dogFactory.produce().race());

        TigerFactory tigerFactory = new TigerFactory();
        System.out.println("老虎的工厂方法: " + tigerFactory.produce().race());
    }
}