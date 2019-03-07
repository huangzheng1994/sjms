package com.example.james.creative.patterns.prototype;

/**
 * @author hz
 * @date 2019-2-21 15:06
 */
public class Square extends Shape {

    public Square() {
        type = "Square(正方形)";
    }

    @Override
    void draw() {
        System.out.println("这是正方形!");
    }
}
