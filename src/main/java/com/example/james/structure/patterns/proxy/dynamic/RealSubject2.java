package com.example.james.structure.patterns.proxy.dynamic;

/**
 * @author hz
 * @date 2020-3-23 17:51
 */
public class RealSubject2 implements Subject {
    @Override
    public void rent() {
        System.out.println("2222222");
    }

    @Override
    public void hello(String str) {
        System.out.println("33333333333");
    }
}
