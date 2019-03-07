package com.example.james.creative.patterns.builder;

import lombok.Data;

/**
 * product角色
 * <p>
 * 这里以游戏开发中人物的构造过程为例。
 * 在游戏中创建一个形象时，需要对每个部位进行创建。简化而言，需要创建头部，身体和四肢。
 * 产品类
 *
 * @author hz
 * @date 2019-2-20 16:30
 */
@Data
public class Person {

    /**
     * 头
     */
    private String head;

    /**
     * 身体
     */
    private String body;

    /**
     * 脚
     */
    private String foot;


}
