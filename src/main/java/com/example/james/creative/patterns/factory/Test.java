package com.example.james.creative.patterns.factory;

/**
 * 工厂方法测试
 *
 * @author hz
 * @date 2019-2-14 11:01
 */
public class Test {

    /**
     * 描述: 测试
     *
     * @param
     * @return
     * @auther: hz
     * @date: 2019-2-14 11:03
     */
    public void factoryTest() {
        DogFactory dogFactory = new DogFactory();
        System.out.println("狗狗的工厂方法" + dogFactory.produce().race());

        TigerFactory tigerFactory = new TigerFactory();
        System.out.println("老虎的工厂方法" + tigerFactory.produce().race());

    }

}
