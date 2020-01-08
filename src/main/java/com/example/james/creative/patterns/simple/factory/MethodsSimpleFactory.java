package com.example.james.creative.patterns.simple.factory;

/**
 * @author hz
 * @date 2019-2-13 19:57
 */
public class MethodsSimpleFactory {

    public Monkey produceMonkey() {
        return new Monkey();
    }

    public Cat produceCat() {
        return new Cat();
    }
}
