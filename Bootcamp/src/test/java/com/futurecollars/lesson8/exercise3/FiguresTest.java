package com.futurecollars.lesson8.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FiguresTest {
    @Test
    void shouldCountSquareArea() {
        //given
        double side = 3.5;
        Square square = new Square(side);

        //when
        double area = square.countArea();
        //then
        Assertions.assertEquals(side * side, area);
    }

    @Test
    void shouldCountCirclePerimeter() {
        //given
        double radius = 4;
        Circle circle = new Circle(radius);
        //when
        double perimeter = circle.countPerimeter();
        //then
        Assertions.assertEquals(2 * Math.PI * radius, perimeter);
    }
}
