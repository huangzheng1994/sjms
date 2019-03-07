package com.example.james.simple.factory;

/**
 * @author hz
 * @date 2019-2-13 20:37
 */
public class Test {

    /**
     * 描述: 测试简单工厂方法
     *
     * @param
     * @return
     * @auther: hz
     * @date: 2019-2-13 20:48
     */
    public String testSimpleFactory() {
        SimpleFactory simpleFactory = new SimpleFactory();
        Animal animal = simpleFactory.produce("猴子");
        return animal.race();
    }

    /**
     * 描述: 测试锁方法简单工厂
     *
     * @param
     * @return
     * @auther: hz
     * @date: 2019-2-13 20:51
     */
    public String testMethodsSimpleFactory() {
        MethodsSimpleFactory methodsSimpleFactory = new MethodsSimpleFactory();
        Animal animal1 = methodsSimpleFactory.produceCat();
        Animal animal2 = methodsSimpleFactory.produceMonkey();
        return "animal1:" + animal1.race() + " animal2:" + animal2.race();
    }

    /**
     * 描述: 测试静态方法简单工厂
     *
     * @param
     * @return
     * @auther: hz
     * @date: 2019-2-13 20:52
     */
    public String testStaticMethodSimpleFactory() {
        Animal cat = StaticMethodSimpleFactory.produceCat();
        Animal monkey = StaticMethodSimpleFactory.produceMonkey();
        return "result1:" + cat.race() + " result2:" + monkey.race();
    }

}
