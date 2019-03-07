package com.example.james.creative.patterns.abstractfactory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hz
 * @date 2019-2-14 15:25
 */
public class TestTest {

    @Test
    public void chinaAnimalFactory() {
        System.out.println("测试开始");
        AbstractAnimalFactory factory = new ChinaAnimalFactory();
        String chinaCat = factory.createCat();
        System.out.println("chinaCat:" + chinaCat);

        String chinaMonkey = factory.createMonkey();
        System.out.println("chinaMonkey:" + chinaMonkey);

        Animal chinaDog = factory.createDog();
        System.out.println("chinaDog:" + chinaDog.race());

        Animal chinaTiger = factory.createTiger();
        System.out.println("chinaTiger:" + chinaTiger.race());
        System.out.println("测试结束");
    }

    @Test
    public void usaAnimalFactory() {
        System.out.println("测试开始");
        AbstractAnimalFactory factory = new UsaAnimalFactory();
        String usaCat = factory.createCat();
        System.out.println("usaCat:" + usaCat);

        String usaMonkey = factory.createMonkey();
        System.out.println("usaMonkey:" + usaMonkey);

        String usaPig = ((UsaAnimalFactory) factory).createPig();
        System.out.println("usaPig:" + usaPig);

        Animal usaDog = factory.createDog();
        System.out.println("usaDog:" + usaDog.race());

        Animal usaTiger = factory.createTiger();
        System.out.println("usaTiger:" + usaTiger.race());
        System.out.println("测试结束");
    }
}