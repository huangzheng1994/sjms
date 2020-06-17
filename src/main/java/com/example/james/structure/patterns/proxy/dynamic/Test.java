package com.example.james.structure.patterns.proxy.dynamic;

import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 动态代理测试
 *
 * @author hz
 * @date 2020-3-23 15:51
 */
public class Test {

    public static void main(String[] args) {
//        //    我们要代理的真实对象
//        Subject realSubject = new RealSubject();
//
//        Subject realSubject2 = new RealSubject2();
//
//        //    我们要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法的
//        DynamicProxy handler = new DynamicProxy(realSubject2);
//
//        /*
//         * 通过Proxy的newProxyInstance方法来创建我们的代理对象，我们来看看其三个参数
//         * 第一个参数 handler.getClass().getClassLoader() ，获取代理类的类加载器
//         * 第二个参数realSubject.getClass().getInterfaces()，被代理类的接口
//         * 第三个参数handler， 代理类的实例
//         */
//
//        Subject subject = (Subject) Proxy.newProxyInstance(realSubject2.getClass().getClassLoader(), realSubject
//                .getClass().getInterfaces(), handler);
//
//        subject.rent();
//        System.out.println("\n");
//        subject.hello("world");
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(1);
        System.out.println(arrayDeque);

        LinkedBlockingDeque<Integer> linkedBlockingDeque = new LinkedBlockingDeque<>();

        linkedBlockingDeque.add(1);

        System.out.println(linkedBlockingDeque.getFirst());

        ConcurrentLinkedDeque<Integer> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();

        concurrentLinkedDeque.add(1);

        System.out.println(concurrentLinkedDeque.getFirst());
    }
}
