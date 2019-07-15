package com.example.james.creative.patterns.factory;

/**
 * 工厂方法模式:用来生成同一等级结构的固定产品, 支持增加任意产品
 * 工厂方法---接口
 * 每个工厂只生产一种产品，客户端通过不同的工厂去生产不同的产品，而生产哪一产品的逻辑交给客户端这边去处理了,不需要修改原有代码
 * 工厂方法模式则只能生产一个产品
 *
 * @author hz
 * @date 2019-6-24 17:50
 */
public interface CarFactory {

    Car product();
}
