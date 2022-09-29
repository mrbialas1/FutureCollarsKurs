package com.futurecollars.lesson8.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeTest {
    @Test
    void shouldRectangleAreaAndPerimeterBeRight() {
        //given
        double length1 = 5;
        double length2 = 2;
        Rectangle rectangle = new Rectangle(length1, length2);
        //when
        double rectangleArea = rectangle.getArea();
        double rectanglePerimeter = rectangle.getPerimeter();
        //then
        Assertions.assertEquals(10, rectangleArea);
        Assertions.assertEquals(14, rectanglePerimeter);
    }

    @Test
    void shouldCircleAreaAndPerimeterBeRight() {
        //given
        double radius = 5;
        Circle circle = new Circle(radius);
        //when
        double circleArea = circle.getArea();
        double circlePerimeter = circle.getPerimeter();
        //then
        Assertions.assertEquals(5 * 5 * Math.PI, circleArea);
        Assertions.assertEquals(10 * Math.PI, circlePerimeter);
    }

    @Test
    void shouldTriangleAreaAndPerimeterBeRight() {
        //given
        double length1 = 5;
        double length2 = 2;
        double length3 = 3;
        double height = 4;
        Shape triangle = new Triangle(length1, length2, length3, height);
        //when
        double rectangleArea = triangle.getArea();
        double rectanglePerimeter = triangle.getPerimeter();
        //then
        Assertions.assertEquals(10, rectangleArea);
        Assertions.assertEquals(10, rectanglePerimeter);
    }

    @Test
    void shouldSquareAreaAndPerimeterBeRight() {
        //given
        double length = 4;
        Circle circle = new Circle(length);
        //when
        double circleArea = circle.getArea();
        double circlePerimeter = circle.getPerimeter();
        //then
        Assertions.assertEquals(4 * 4 * Math.PI, circleArea);
        Assertions.assertEquals(8 * Math.PI, circlePerimeter);
    }
}
