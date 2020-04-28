package com.example.james.behavior.patterns.strategy;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author hz
 * @date 2020-4-2 16:24
 */
public class Test implements Runnable {

    private static int i = 0;

    private static ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("demo-pool-%d").build();

    private static ExecutorService pool = new ThreadPoolExecutor(
            0,
            10,
            10L,
            TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(12),
            threadFactory);

    /**
     * 线程同步方法
     */
    public  void increase() {
        i++;
    }

    @Override
    public void run() {
        for (int j = 0; j < 1000; j++) {
            increase();
            System.out.println("run====="+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        String a = "A";
//        Test test = new Test();
//        pool.submit(test);
//        pool.submit(test);
//        pool.submit(test);
////        Thread a = new Thread(test);
////        Thread b = new Thread(test);
////        Thread c = new Thread(test);
////
////        a.start();
////        b.start();
////        c.start();
////        a.join();
////        b.join();
////        c.join();
////        System.out.println(i);
//        pool.shutdown();
//        pool.shutdownNow();
//
////        boolean b = pool.awaitTermination(10, TimeUnit.SECONDS);
//        System.out.println("最终结果:"+i);
////        if (!b){
////            System.out.println("超时");
////        }else {
////            System.out.println("最终结果:"+i);
////        }
////        Thread.sleep(1000);
        String a =  "# -*- coding: utf-8 -*-\n# !/usr/bin/env jython\nfrom me.hekr.bot.ifttt.client.InternalClient import *\n\n\nif __name__ == \"__main__\":\n\n    args = _context.getEventMap().get(\"deviceReport\").getPayload().getPayload()\n    tid = _event.getPayload().getDevTid()\n    device_type = _context.getEventMap().get(\"deviceReport\").getPayload().getType()\n    result = 0\n    same_device_type = 0\n    if 79 == device_type:\n        same_device_type=same_device_type+1\n        left=[]\n        left.append(\"H0179063001\")\n        left.append(\"H0279063001\")\n        left.append(\"H0379063001\")\n        left.append(\"H0479063001\")\n        left.append(\"H0579063001\")\n        left.append(\"H0679063001\")\n        for key in args.keys():\n            if key in left:\n                lsatValues=_client.updateLastValues(\"5b83a462bf80155a329f37b7\",tid,79,args.get(key))\n                lsatValues_len=len(lsatValues)\n                if args.get(key)<-19:\n                    result=result+1\n    if same_device_type == result and result != 1:\n        if 79 != device_type:\n            alarmRuleConditions=_client.getAlarmRuleConditionList(\"5b83a462bf80155a329f37b7\",79)\n            if len(alarmRuleConditions) > 0 :\n                for condition in  alarmRuleConditions :\n                    last_result=result+1\n                    lastValues=condition.getLastValues()\n                    lastValues_len=len(lastValues) \n                    if lastValues_len > 0 and lastValues[lastValues_len-1] <-19:\n                        result=result+1\n                    if last_result== result:\n                        break\n    if result == 1:\n        _client.storeAlarmMsg(tid,\"%E7%8E%AF%E5%A2%83%E6%B8%A9%E5%BA%A6%E5%8F%96%E5%80%BC%E5%B0%8F%E4%BA%8E-19%E2%84%83\", \"WARNING\",\"5b83a462bf80155a329f37b7\",\"5b83a462bf80155a329f37b7\")\n";
        System.out.println(a);
    }

}
