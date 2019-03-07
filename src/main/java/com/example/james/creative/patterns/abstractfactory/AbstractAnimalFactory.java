package com.example.james.creative.patterns.abstractfactory;

/**
 * 动物抽象工厂
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
