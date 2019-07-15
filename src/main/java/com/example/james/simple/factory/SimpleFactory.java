package com.example.james.simple.factory;

/**
 * 简单工厂模式:用来生成同一等级结构中的任意产品, 对于增加新的产品, 需要修改已有代码
 *
 * @author hz
 * @date 2019-2-13 19:56
 */
public class SimpleFactory {

    public static Animal produce(String type) {
        Animal animal;
        switch (type) {
            case "猴子":
                animal = new Monkey();
                break;
            case "猫":
                animal = new Cat();
                break;
            default:
                animal = null;
                break;
        }
        return animal;
    }
}
