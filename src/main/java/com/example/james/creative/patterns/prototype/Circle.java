package com.example.james.creative.patterns.prototype;

/**
 * @author hz
 * @date 2019-2-21 15:07
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle(圆形)";
    }

    @Override
    void draw() {
        System.out.println("这是圆形!");
    }
}
