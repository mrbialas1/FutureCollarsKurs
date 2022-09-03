package com.futurecollars.lesson8.exercise2;

public class Circle extends Shape{
    double radiusLength=5;
    double pi=Math.PI;
    @Override
    public double getArea() {
        return pi*radiusLength*radiusLength;
    }

    @Override
    public double getPerimeter() {
        return 2*pi*radiusLength;
    }
}
