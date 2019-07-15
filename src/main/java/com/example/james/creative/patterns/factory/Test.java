package com.example.james.creative.patterns.factory;

import java.util.*;

/**
 * 工厂方法测试
 *
 * @author hz
 * @date 2019-2-14 11:01
 */
public class Test {

    /**
     * 描述: 测试
     *
     * @param
     * @return
     * @auther: hz
     * @date: 2019-2-14 11:03
     */
    public void factoryTest() throws Exception {
//        CarFactory benz = new BenzFactory();
        CarFactory benz = (CarFactory) Class.forName("com.example.james.creative.patterns.factory.BenzFactory").newInstance();
        String brand = benz.product().getBrand();

        BmwFactory bmw = (BmwFactory) Class.forName("com.example.james.creative.patterns.factory.BmwFactory").newInstance();
        String brand1 = bmw.product().getBrand();
    }


    public static void main(String[] args) {
        HashMap<String, String> kmap = new HashMap<String, String>();
        HashMap<String, String> emap = new HashMap<String, String>();

        //装数据
        for (int i = 0; i < 1000; i++) {
            kmap.put("" + i, "YL");
        }
        for (int i = 0; i < 1000; i++) {
            emap.put("" + i, "ZT");
        }

        long stimes = System.currentTimeMillis();
        Iterator<String> ktor = kmap.keySet().iterator();
        while (ktor.hasNext()) {
            System.out.println(ktor.next());
        }

        long stimes1 = System.currentTimeMillis();

        //结束时间并且也是entrySet的开始时间
        System.out.println("time1: " + (stimes1 - stimes));

        for (Map.Entry<String, String> e : emap.entrySet()) {
            //System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        long stimes2 = System.currentTimeMillis();
        System.out.println("time2: " + (stimes2 - stimes1));

        HashMap<String, String> hm = new HashMap<>(2);
        hm.put("111", "222");

        Set<Map.Entry<String, String>> entrySet = hm.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }

}
