package com.example.james.creative.patterns.abstractfactory;

/**
 * 动物抽象工厂
 *
 * 抽象工厂模式:针对多级产品结构(系列产品)的一种工厂模式,每个工厂都可以生产多个产品，它们是一个品牌。而不同的产品继承自不同的抽象产品接口。
 * 抽象工厂是可以生产多个产品的
 *
 * @author hz
 * @date 2019-2-14 14:40
 */
public abstract class AbstractAnimalFactory {

    /**
     * 描述: 创建猴子
     *
     * @param
     * @return
     * @auther: hz
     * @date: 2019-2-14 14:52
     */
    abstract String createMonkey();

    /**
     * 描述: 创建猫猫
     *
     * @param
     * @return
     * @auther: hz
     * @date: 2019-2-14 14:52
     */
    abstract String createCat();

    /**
     * 描述: 创建狗狗
     *
     * @param
     * @return
     * @auther: hz
     * @date: 2019-2-14 15:01
     */
    abstract Animal createDog();

    /**
     * 描述: 创建老虎
     *
     * @param
     * @return
     * @auther: hz
     * @date: 2019-2-14 15:05
     */
    abstract Animal createTiger();

}
