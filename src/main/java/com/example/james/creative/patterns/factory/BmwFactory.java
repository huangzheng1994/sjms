package com.example.james.creative.patterns.factory;

/**
 * 宝马汽车工厂
 *
 * @author hz
 * @date 2019-6-24 17:53
 */
public class BmwFactory implements CarFactory {
    @Override
    public Car product() {
        return new Car("BMW--X6");
    }

    public Car ddd() {
        return new Car("BMW--X3");
    }
}
