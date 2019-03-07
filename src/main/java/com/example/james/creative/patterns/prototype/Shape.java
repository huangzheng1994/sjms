package com.example.james.creative.patterns.prototype;

import lombok.Data;

/**
 * 原型模式
 *
 * @author hz
 * @date 2019-2-21 14:55
 */
@Data
public abstract class Shape implements Cloneable {

    private String id;

    protected String type;

    abstract void draw();


    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException c) {
            c.printStackTrace();
        }
        return clone;
    }

}
