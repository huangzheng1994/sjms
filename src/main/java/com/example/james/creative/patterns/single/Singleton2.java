package com.example.james.creative.patterns.single;

/**
 * 单例 - 懒汉模式, 线程安全
 * 但是该方式运行效率却很低下，下一个线程想要获取对象，就必须等待上一个线程释放锁之后，才可以继续运行
 *
 * @author hz
 * @date 2019-2-14 20:47
 */
public class Singleton2 {

    private Singleton2() {
    }

    private static Singleton2 single = null;

    public static Singleton2 getInstance() {
        synchronized (Singleton2.class) {
            if (null == single) {
                single = new Singleton2();
            }
        }
        return single;
    }

}
