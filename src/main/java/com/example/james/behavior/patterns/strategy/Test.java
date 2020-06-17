package com.example.james.behavior.patterns.strategy;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.checkerframework.checker.units.qual.A;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

/**
 * @author hz
 * @date 2020-4-2 16:24
 */
public class Test {


    public static void main(String[] args) {
//        String str1 = "abcd"; // 常量池创建"abcd"
//        String str2 = "abcd"; // str2还是上一步的"abcd"
//        String str3 = "ab" + "cd"; // 常量池创建"ab"和"cd"，连接过程编译器直接优化成"abcd"，而常量池已经有了"abcd"，所以str3和str1都指向"abcd"
//        String str5 = "ab";
//        String s = new String("ab")+new String("cd");
//        String str4 = "ab";
//        String str5 = "cd";
//        str4 += "cd";
//        String a = str4 + str5;
//        String aa = new String("ab");//指向堆内存
//        System.out.println("aa=" + (aa == aa.intern()));//fales,aa指向的堆内存地址,而aa.intern()方法返回的是常量池中的地址
//        String bb = "cd";//指向常量池
//        System.out.println("cd=" + (bb == bb.intern()));//fales,aa指向的堆内存地址,而aa.intern()方法返回的是常量池中的地址
//        String a = aa + bb;
//        System.out.println(a.intern() == a); // true指向常量池,false-指向堆
//        System.out.println("================");
//        String s1 = "a";
//        String s2 = "b";
//        String s3 = "ab";
//        final String ss1 = "a";
//        final String ss2 = "b";
//        System.out.println(s1 + s2 == s3); // false, 有变量引用的字符串是不能优化的，除非变量是final修饰，这一行就是s1+s2生成堆里的"ab"和常量池的"ab"在比较
//        System.out.println(ss1 + ss2 == s3); // true，原因见上一行，原理和下一行相同，都是常量连接
//        System.out.println("a" + "b" == s3); // true,常量池的"a"和"b"连接，根据Copy On Write机制, 副本连接生成"ab"，发现已存在，直接指向"ab"，所以和s3相等

//        String a = new StringBuilder().append("abcd").toString();
//        String a = new String("abcd");
//        String c = new StringBuilder().append("e").toString();
//        String a4 = new String("AB");//在堆和常量池分别创建.指向堆
//        String a4 = "AB";//在常量池创建.指向常量池

        //1:已知在堆和常量池分别创建"AB",则aa在堆中创建"AB",并且指向他
        //2:
//        String aa = a2 + a3;//堆=未知,常量池创建,指向常量池
//        String a1 = "A";
//        a1+="B";
//        String aa = a1 + "B" + "C";//堆创建,指向堆
        String a3 = new String("A") + new String("B");
//        System.out.println(a4 == a4.intern());//true
        String a4 = "AB";
        System.out.println(a3 == a3.intern());//true
//        System.out.println(aa == aaaa);//true
//        System.out.println(aa == a4);//true
//        System.out.println(aa.intern() == a4);//true
        System.out.println(a3 == a3.intern());//false

        System.out.println("测试4");
        System.out.println("测试5");
        System.out.println("测试6");
        System.out.println("分支test1修改");


    }
}
