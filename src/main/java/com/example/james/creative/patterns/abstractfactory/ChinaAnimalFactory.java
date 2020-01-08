package com.example.james.creative.patterns.abstractfactory;

/**
 * 中国动物园工厂
 *
 * @author hz
 * @date 2019-2-14 14:54
 */
public class ChinaAnimalFactory extends AbstractAnimalFactory {

    @Override
    String createMonkey() {
        return "金丝猴";
    }

    @Override
    String createCat() {
        return "中国狸花猫";
    }

    @Override
    ChinaDog createDog() {
        return new ChinaDog();
    }

    @Override
    ChinaTiger createTiger() {
        return new ChinaTiger();
    }
}
