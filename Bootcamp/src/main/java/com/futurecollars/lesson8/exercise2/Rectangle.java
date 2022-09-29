package com.futurecollars.lesson8.exercise2;

public class Rectangle extends Shape {

    public Rectangle(double length1, double length2) {
        super(length1, length2, 0, 0);
    }

    @Override
    public double getArea() {
        return getLength1() * getLength2();
    }

    @Override
    public double getPerimeter() {
        return getLength1() * 2 + getLength2() * 2;
    }
}
