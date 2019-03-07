package com.example.james.creative.patterns.single;

/**
 * 静态内部类实现
 * 静态内部类虽然保证了单例在多线程并发下的线程安全性，
 * 但是在遇到序列化对象时，默认的方式运行得到的结果就是多例的.
 *
 * 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 *
 * 优点：避免了线程不安全，延迟加载，效率高。
 * @author hz
 * @date 2019-2-14 17:20
 */
public class Singleton4 {


    private Singleton4() {
    }

    /**
     * 静态内部类
     */
    private static class InnerSingle {
        private static Singleton4 single = new Singleton4();
    }


    public static Singleton4 getInstance() {
        return InnerSingle.single;
    }
}
