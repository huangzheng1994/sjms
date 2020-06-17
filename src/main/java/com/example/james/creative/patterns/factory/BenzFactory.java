package com.example.james.creative.patterns.factory;

/**
 * 奔驰汽车工厂
 *
 * @author hz
 * @date 2019-6-24 17:51
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car product() {
        return new Car("Benz--S600");
    }
}
