package com.example.james.structure.patterns.adapter;

/**
 * 接口适配器--适配器角色
 *
 * @author hz
 * @date 2020-1-8 11:48
 */
public abstract class DeviceAdapter implements Device {
    @Override
    public void benz() {
        System.out.println(1111);
    }

    @Override
    public void bmw() {
        System.out.println(2222);
    }

    @Override
    public void rollsRoyce() {
        System.out.println(3333);
    }

    @Override
    public void landRover() {
        System.out.println(4444);
    }
}
