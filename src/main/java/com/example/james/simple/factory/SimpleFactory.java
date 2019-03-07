package com.example.james.simple.factory;

/**
 * @author hz
 * @date 2019-2-13 19:56
 */
public class SimpleFactory {

    public Animal produce(String type) {
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
