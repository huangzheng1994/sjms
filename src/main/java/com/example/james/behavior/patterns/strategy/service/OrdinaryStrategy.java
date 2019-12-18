package com.example.james.behavior.patterns.strategy.service;

/**
 * 普通会员
 *
 * @author hz
 * @date 2019-12-18 15:40
 */
public class OrdinaryStrategy implements Strategy {
    @Override
    public double compute(long money) {
        System.out.println("普通会员 不打折");
        return money;
    }

    @Override
    public int getType() {
        return 0;
    }
}