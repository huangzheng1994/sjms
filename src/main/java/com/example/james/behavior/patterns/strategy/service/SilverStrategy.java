package com.example.james.behavior.patterns.strategy.service;

import com.example.james.behavior.patterns.strategy.scene;

/**
 * 白银会员
 *
 * @author hz
 * @date 2019-12-18 15:41
 */
public class SilverStrategy implements Strategy {
    @Override
    public double compute(long money) {
        System.out.println("白银会员 优惠50元");
        return money - 50;
    }

    @Override
    public int getType() {
        return scene.UserType.SILVER_VIP.getCode();
    }
}