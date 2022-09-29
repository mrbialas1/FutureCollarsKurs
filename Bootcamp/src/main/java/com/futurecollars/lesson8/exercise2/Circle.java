package com.futurecollars.lesson8.exercise2;

public class Circle extends Square {

    public Circle(double length1) {
        super(length1);
    }

    @Override
    public double getArea() {
        return Math.PI * getLength1() * getLength1();
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getLength1();
    }
}
