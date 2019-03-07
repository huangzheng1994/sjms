package com.example.james.creative.patterns.prototype;

/**
 * @author hz
 * @date 2019-2-21 14:58
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle(矩形)";
    }

    @Override
    void draw() {
        System.out.println("这是矩形!");
    }
}
