package com.example.james.creative.patterns.abstractfactory;

/**
 * @author hz
 * @date 2019-2-14 14:54
 */
public class UsaAnimalFactory extends AbstractAnimalFactory {

    @Override
    String createMonkey() {
        return "我是美国猴子!";
    }

    @Override
    String createCat() {
        return "我是美国短尾猫!";
    }

    @Override
    Animal createDog() {
        return new UsaDog();
    }

    @Override
    Animal createTiger() {
        return new UsaTiger();
    }

    public String createPig() {
        return "我是美国猪";
    }
}
