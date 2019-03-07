package com.example.james.simple.factory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hz
 * @date 2019-2-13 20:57
 */
public class TestTest {

    @Test
    public void testSimpleFactory() {
        SimpleFactory simpleFactory = new SimpleFactory();
        Animal animal = simpleFactory.produce("猴子");
        System.out.println("animal:" + animal.race());
    }

    @Test
    public void testMethodsSimpleFactory() {
        MethodsSimpleFactory methodsSimpleFactory = new MethodsSimpleFactory();
        Animal animal1 = methodsSimpleFactory.produceCat();
        Animal animal2 = methodsSimpleFactory.produceMonkey();
        System.out.println("animal1:" + animal1.race());
        System.out.println("animal2:" + animal2.race());
    }

    @Test
    public void testStaticMethodSimpleFactory() {
        Animal cat = StaticMethodSimpleFactory.produceCat();
        Animal monkey = StaticMethodSimpleFactory.produceMonkey();
        System.out.println("cat:" + cat.race());
        System.out.println("monkey:" + monkey.race());

    }
}