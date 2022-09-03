package com.futurecollars.lesson8.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeTest {
    @Test
    void shouldRectangleAreaAndPerimeterBeRight() {
        //given
        Rectangle rectangle = new Rectangle();
        //when
        double rectangleArea = rectangle.getArea();
        double rectanglePerimeter = rectangle.getPerimeter();
        //then
        Assertions.assertEquals(10, rectangleArea);
        Assertions.assertEquals(15, rectanglePerimeter);
    }
    @Test
    void shouldCircleAreaAndPerimeterBeRight() {
        //given
        Circle circle = new Circle();
        //when
        double circleArea = circle.getArea();
        double circlePerimeter = circle.getPerimeter();
        //then
        Assertions.assertEquals(5*5*Math.PI, circleArea);
        Assertions.assertEquals(10*Math.PI, circlePerimeter);
    }
}
