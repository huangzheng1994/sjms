package com.example.james.creative.patterns.factory;

/**
 * 老虎的工厂方法
 *
 * @author hz
 * @date 2019-2-14 10:56
 */
public class TigerFactory implements Provider {
    @Override
    public Animal produce() {
        return new Tiger();
    }
}
