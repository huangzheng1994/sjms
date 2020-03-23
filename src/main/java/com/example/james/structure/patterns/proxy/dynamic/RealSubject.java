package com.example.james.structure.patterns.proxy.dynamic;

/**
 * 真实对象
 * @author hz
 * @date 2020-3-23 15:47
 */
public class RealSubject implements Subject {
    @Override
    public void rent() {
        System.out.println("I want to rent my house !");
    }

    @Override
    public void hello(String str) {
        System.out.println("hello: " + str);
    }
}
