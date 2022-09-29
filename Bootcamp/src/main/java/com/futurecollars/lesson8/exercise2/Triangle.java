package com.futurecollars.lesson8.exercise2;

public class Triangle extends Shape {

    public Triangle(double length1, double length2, double length3, double height) {
        super(length1, length2, length3, height);
    }

    @Override
    public double getArea() {
        return getLength1() * getLength4() / 2;
    }

    @Override
    public double getPerimeter() {
        return getLength1() + getLength2() + getLength3();
    }
}
