package com.example.james.structure.patterns.adapter;

/**
 * 接口适配器--测试缺省适配器模式需要用到的类
 *
 * @author hz
 * @date 2020-1-8 13:45
 */
public class DeviceOperator {

    private final DeviceAdapter sampleOperation;


    public DeviceOperator(DeviceAdapter deviceAdapter) {
        this.sampleOperation = deviceAdapter;
    }

    public void creatBenz() {
        sampleOperation.benz();
    }

    public void creatBmw() {
        sampleOperation.bmw();
    }

    public void creatLanRover() {
        sampleOperation.landRover();
    }

    public void creatRollsRoyce() {
        sampleOperation.rollsRoyce();
    }
}
