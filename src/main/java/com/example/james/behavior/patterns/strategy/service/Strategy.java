package com.example.james.behavior.patterns.strategy.service;

import com.example.james.behavior.patterns.strategy.scene;

/**
 * @author hz
 * @date 2019-12-18 15:27
 */
public interface Strategy {
    /**
     * 计费方法
     */
    double compute(long money);

    /**
     * 会员类型
     */
    int getType();

}