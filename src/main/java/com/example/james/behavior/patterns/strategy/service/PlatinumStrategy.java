package com.example.james.behavior.patterns.strategy.service;

import com.example.james.behavior.patterns.strategy.scene;

/**
 * 白金会员
 *
 * @author hz
 * @date 2019-12-18 15:42
 */
public class PlatinumStrategy implements Strategy {
    @Override
    public double compute(long money) {
        System.out.println("白金会员 优惠50元，再打7折");
        return (money - 50) * 0.7;
    }

    @Override
    public int getType() {
        return scene.UserType.PLATINUM_VIP.getCode();
    }
}