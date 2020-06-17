package com.example.james.behavior.patterns.strategy;

import com.example.james.behavior.patterns.strategy.service.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.Map;

/**
 * @author hz
 * @date 2019-12-18 15:29
 */
public class scene {

    @Getter
    @AllArgsConstructor
    public static enum UserType {
        SILVER_VIP(1, "白银会员 优惠50元"),
        GOLD_VIP(2, "黄金会员 8折"),
        PLATINUM_VIP(3, "白金会员 优惠50元，再打7折");

        private int code;
        private String mean;
    }


    /**
     * 一个电商系统，当用户消费满1000 金额，可以根据用户VIP等级，享受打折优惠。
     * 根据用户VIP等级，计算出用户最终的费用。
     * <p>
     * 普通会员 不打折
     * 白银会员 优惠50元
     * 黄金会员 8折
     * 白金会员 优惠50元，再打7折
     */
    public double getResult1(int money, int type) {
        double result = money;
        if (money >= 1000) {
            if (type == UserType.SILVER_VIP.getCode()) {

                System.out.println("白银会员 优惠50元");
                result = money - 50;
            } else if (type == UserType.GOLD_VIP.getCode()) {

                System.out.println("黄金会员 8折");
                result = money * 0.8;
            } else if (type == UserType.PLATINUM_VIP.getCode()) {

                System.out.println("白金会员 优惠50元，再打7折");
                result = (money - 50) * 0.7;
            } else {
                System.out.println("普通会员 不打折");
            }
        }
        return result;
    }

    /**
     * 使用策略模式,if-else 依然存在
     */
    public double getResult1(long money, int type) {
        if (money < 1000) {
            return money;
        }

        Strategy strategy;

        if (type == UserType.SILVER_VIP.getCode()) {
            strategy = new SilverStrategy();
        } else if (type == UserType.GOLD_VIP.getCode()) {
            strategy = new GoldStrategy();
        } else if (type == UserType.PLATINUM_VIP.getCode()) {
            strategy = new PlatinumStrategy();
        } else {
            strategy = new OrdinaryStrategy();
        }

        return strategy.compute(money);
    }

    /**
     * 工厂+策略模式
     */
    public double getResult2(long money, int type) {

        if (money < 1000) {
            return money;
        }

        Strategy strategy = StrategyFactory.getInstance().get(type);

        if (strategy == null) {
            throw new IllegalArgumentException("please input right type");
        }

        return strategy.compute(money);
    }


}