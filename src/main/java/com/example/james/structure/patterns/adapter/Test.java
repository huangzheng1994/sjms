package com.example.james.structure.patterns.adapter;

/**
 * @author hz
 * @date 2020-1-8 11:14
 */
public class Test {


    public static void main(String[] args) {
        //类适配
        System.out.println("适配器模式测试:");
        Motor electric = new ElectricAdapter();
        electric.drive();

        //对象适配
        Motor optical = new OpticalAdapter();
        optical.drive();

        //接口适配
        DeviceOperator deviceOperator = new DeviceOperator(new DeviceAdapter() {
            @Override
            public void benz() {
                super.benz();
                System.out.println("==>重写奔驰");
            }

            @Override
            public void rollsRoyce() {
                super.rollsRoyce();
                System.out.println("==>重写劳斯莱斯");
            }
        });

        deviceOperator.creatBenz();
        deviceOperator.creatRollsRoyce();

    }


}
