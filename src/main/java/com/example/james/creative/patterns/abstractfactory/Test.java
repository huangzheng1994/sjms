package com.example.james.creative.patterns.abstractfactory;

import jdk.internal.org.objectweb.asm.tree.analysis.Analyzer;

/**
 * @author hz
 * @date 2019-2-14 15:09
 */
public class Test {

    /**
     * 描述: 中国动物工厂
     *
     * @param
     * @return
     * @auther: hz
     * @date: 2019-2-14 15:16
     */
    public void chinaAnimalFactory() {
        AbstractAnimalFactory factory = new ChinaAnimalFactory();
        String chinaCat = factory.createCat();
        System.out.println("chinaCat:" + chinaCat);

        String chinaMonkey = factory.createMonkey();
        System.out.println("chinaMonkey:" + chinaMonkey);

        Animal chinaDog = factory.createDog();
        System.out.println("chinaDog:" + chinaDog.race());

        Animal chinaTiger = factory.createTiger();
        System.out.println("chinaTiger:" + chinaTiger.race());
    }


    /**
     * 描述: 美国动物工厂
     *
     * @param
     * @return
     * @auther: hz
     * @date: 2019-2-14 15:18
     */
    public void usaAnimalFactory() {
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
    }

}
