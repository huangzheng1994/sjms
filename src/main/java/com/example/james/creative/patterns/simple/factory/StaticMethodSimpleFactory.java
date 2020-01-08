package com.example.james.creative.patterns.simple.factory;

/**
 * @author hz
 * @date 2019-2-13 19:58
 */
public class StaticMethodSimpleFactory {

    public static Monkey produceMonkey() {
        return new Monkey();
    }

    public static Cat produceCat() {
        return new Cat();
    }

}
