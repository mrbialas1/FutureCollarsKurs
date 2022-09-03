package com.futurecollars.lesson8.exercise2;

public class Triangle extends Shape{
    double side1Length=2;
    double side2Length=3;
    double side3Length=4;
    double height1Length=5;
    @Override
    public double getArea() {
        return side1Length * height1Length / 2;
    }

    @Override
    public double getPerimeter() {
        return side1Length + side2Length + side3Length;
    }
}
