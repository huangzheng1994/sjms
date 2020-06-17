package com.example.james.behavior.patterns.strategy.service;

import com.example.james.behavior.patterns.strategy.scene;

/**
 * 黄金会员
 *
 * @author hz
 * @date 2019-12-18 15:42
 */
public class GoldStrategy implements Strategy {
    @Override
    public double compute(long money) {
        System.out.println("黄金会员 8折");
        return money * 0.8;
    }

    @Override
    public int getType() {
        return scene.UserType.GOLD_VIP.getCode();
    }
}
