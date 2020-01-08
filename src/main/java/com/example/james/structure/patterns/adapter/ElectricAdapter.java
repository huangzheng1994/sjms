package com.example.james.structure.patterns.adapter;

/**
 * 类适配器模式（class adapter pattern）
 * <p>
 * 类适配器模式在编译时实现target（目标）接口。这种适配器模式使用了多个实现了期待的接口或者已经存在的接口的多态接口
 * 。比较典型的就是：target接口被创建为一个纯粹的接口，如Java不支持多继承的语言。
 *
 * @author hz
 * @date 2020-1-8 11:11
 */
public class ElectricAdapter extends ElectricMotor implements Motor {

    @Override
    public void electricDrive() {
        System.out.println("重写==>电能发动机驱动汽车");
    }

    @Override
    public void drive() {
        super.electricDrive();
        this.electricDrive();
    }
}
