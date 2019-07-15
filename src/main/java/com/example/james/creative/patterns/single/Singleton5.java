package com.example.james.creative.patterns.single;

/**
 * 枚举单例 最佳单例模式
 * <p>
 * 目前最为安全的实现单例的方法是通过内部静态enum的方法来实现，因为JVM会保证enum不能被反射并且构造器方法只执行一次。
 * 不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 *
 * @author hz
 * @date 2019-2-14 17:20
 */
public class Singleton5 {

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {

        /**
         * 实例
         */
        INSTANCE;

        // 需要的单例
        private Singleton5 singleton;

        /**
         * JVM会保证此方法绝对只调用一次
         */
        Singleton() {
            singleton = new Singleton5();
        }

        public Singleton5 getInstance() {
            return singleton;
        }
    }
}
