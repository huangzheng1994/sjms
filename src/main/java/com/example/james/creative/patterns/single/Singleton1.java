package com.example.james.creative.patterns.single;

/**
 * 饿汗式单例(立即加载)
 * 静态常量
 *
 * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 *
 * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 *
 * @author hz
 * @date 2019-2-14 20:47
 */
public class Singleton1 {

    private Singleton1() {
    }

    private final static Singleton1 SINGLE = new Singleton1();

    public static Singleton1 getInstance() {
        return SINGLE;
    }

}

///**
// * 饿汗式单例(立即加载)
// * 静态代码块
// *
// * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
// *
// * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
// *
// * @author hz
// * @date 2019-2-14 20:47
// */
//public class Singleton {
//
//    private static Singleton instance;
//
//    static {
//        instance = new Singleton();
//    }
//
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        return instance;
//    }
//}