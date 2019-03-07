package com.example.james.creative.patterns.prototype;

/**
 * @author hz
 * @date 2019-2-21 15:51
 */
public class Test {

    public void testPrototypePatternDemo() {
        ShapeCache.loadShape();

        Shape shape = ShapeCache.getShape("1");

        Shape shape1 = ShapeCache.getShape("2");

        Shape shape2 = ShapeCache.getShape("3");
    }

}
