package com.example.james.creative.patterns.single;

/**
 * 懒汉式单例(延迟加载)
 *
 * @author hz
 * @date 2019-2-14 17:20
 */
public class Singleton {

    private static volatile Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (null == instance) {
            instance = new Singleton();
        }
        System.out.println("这里是test3");
        return instance;
    }
}


///**
// * 懒汉式单例(延迟加载)线程不安全
// *
// * 这种写法起到了Lazy Loading的效果，但是只能在单线程下使用。
// * 如果在多线程下，一个线程进入了if (singleton == null)判断语句块，
// * 还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式。
// *
// * @author hz
// * @date 2019-2-14 17:20
// */
//public class Singleton {
//
//    private static Singleton singleton;
//
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }
//}


///**
// * 懒汉式单例,线程不安全，同步方法
// *
// * 这种写法起到了Lazy Loading的效果，但是只能在单线程下使用。
// * 如果在多线程下，一个线程进入了if (singleton == null)判断语句块，
// * 还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式。
// *
// * @author hz
// * @date 2019-2-14 17:20
// */
//public class Singleton {
//
//    private static Singleton singleton;
//
//    private Singleton() {}
//
//    public static synchronized Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }
//}