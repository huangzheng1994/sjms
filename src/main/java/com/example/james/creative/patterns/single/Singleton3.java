package com.example.james.creative.patterns.single;

/**
 * 懒汉,多线程环境
 * <p>
 * 优点：线程安全；延迟加载；效率较高。
 * <p>
 * 由于jvm存在乱序执行功能，DCL也会出现线程不安全的情况
 * <p>
 * 不过在JDK1.5之后，官方也发现了这个问题，故而具体化了volatile，即在JDK1.6及以后，
 * 只要定义为private volatile static SingleTon  INSTANCE = null;就可解决DCL失效问题。
 * volatile确保INSTANCE每次均在主内存中读取，这样虽然会牺牲一点效率，但也无伤大雅。
 *
 * @author hz
 * @date 2019-2-14 20:47
 */
public class Singleton3 {

    private Singleton3() {
    }

    private static volatile Singleton3 single = null;


    public static Singleton3 getInstance() {
        //双重检查
        if (null == single) {
            synchronized (Singleton3.class) {
                if (null == single) {
                    single = new Singleton3();
                }
            }
        }
        return single;
    }

}
