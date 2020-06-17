package com.example.james.structure.patterns.adapter;

/**
 * 对象适配器模式（object adapter pattern）
 * <p>
 * 对象适配器模式在运行时实现target（目标）接口。在这种适配器模式中，适配器包装了一个类实例。在这种情况下，适配器调用包装对象实例的方法。
 * 一个对象适配器可以把多个不同的适配者adaptee适配到一个目标，也就是说，同一个适配器可以将适配者类和它的子类都适配到目标接口。
 *
 * @author hz
 * @date 2020-1-8 11:13
 */
public class OpticalAdapter implements Motor {

    private final OpticalMotor opticalMotor;
    //还可以适配n个适配者对象

    public OpticalAdapter() {
        this.opticalMotor = new OpticalMotor();
    }


    @Override
    public void drive() {
        opticalMotor.opticalDrive();
    }
}
