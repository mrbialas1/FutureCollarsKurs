package com.futurecollars.lesson8.exercise2;

public class Square extends Shape{
    double sideLength;
    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideLength;
    }
}
