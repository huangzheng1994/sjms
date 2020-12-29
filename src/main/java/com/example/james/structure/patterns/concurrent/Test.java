package com.example.james.structure.patterns.concurrent;

import com.example.james.test.utils.DESCoder;
import com.example.james.test.utils.DataUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author hz
 * @date 2020-11-12 14:44
 */
public class Test {

    public static final ExecutorService EXECUTOR_SERVICE = new ThreadPoolExecutor(2,
            1000,
            200,
            TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<>());

    public static Integer d = 0;

    static List<AtomicInteger> drivers1 = new ArrayList<>();

    static ConcurrentHashMap<Integer, AtomicInteger> drivers2 = new ConcurrentHashMap();

    static {
        for (int i = 0; i < 1000; i++) {
            AtomicInteger atomicInteger = new AtomicInteger(i);
            drivers1.add(atomicInteger);
            drivers2.put(i, atomicInteger);
        }

    }


//    public static void main(String[] args) throws InterruptedException {
//        int a = 999;
//
////        for (int i = 0; i < 1000; i++) {
////            Integer b = 2;
////            Thread thread = new Thread(new Runnable() {
////                @Override
////                public void run() {
//////                    synchronized (b) {
//////                        int a = 999;
//////                        drivers1.set(a, drivers1.get(a) + 1);
//////                        System.out.println(drivers1.get(a));
//////                    }
////
////                    int aa = drivers2.get(a).incrementAndGet();
//////                    int bb = drivers2.get(a).incrementAndGet();
////
////                    System.out.println("aa=" + aa);
//////                    System.out.println("bb=" + bb);
////                }
////            });
////            thread.start();
////        }
//
//        for (int i = 0; i < 1000; i++) {
//            EXECUTOR_SERVICE.execute(
//                    () -> {
//                        int aa = drivers2.get(a).incrementAndGet();
//                        System.out.println("aa=" + aa);
//                    });
//        }
////        EXECUTOR_SERVICE.shutdown();
//
//
//        Thread.sleep(3000);
//        System.out.println("===> " + drivers2.get(a));
//
//        for (int i = 0; i < 1000; i++) {
//            EXECUTOR_SERVICE.execute(
//                    () -> {
//                        int aa = drivers1.get(a).incrementAndGet();
//                        System.out.println("aa=" + aa);
//                    });
//        }
//        EXECUTOR_SERVICE.shutdown();
//
//        Thread.sleep(3000);
//        System.out.println("===> " + drivers1.get(a));
//    }

//    public static void main(String[] args) {
//        Random random = new Random();
//        int number = random.nextInt(9999999);
//        System.out.println(number);
//    }


    private synchronized static void add_int() {
        d = d + 1;
        System.out.println(d);
    }

}
