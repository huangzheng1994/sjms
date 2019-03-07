package com.example.james.creative.patterns.prototype;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hz
 * @date 2019-2-21 15:54
 */
public class TestTest {

    @Test
    public void testPrototypePatternDemo() {
        ShapeCache.loadShape();

        Shape shape = ShapeCache.getShape("1");
        shape.draw();

        Shape shape1 = ShapeCache.getShape("2");
        shape1.draw();

        Shape shape2 = ShapeCache.getShape("3");
        shape2.draw();
    }
}