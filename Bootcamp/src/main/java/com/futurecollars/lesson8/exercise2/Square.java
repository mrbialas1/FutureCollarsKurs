package com.futurecollars.lesson8.exercise2;

public class Square extends Rectangle {

    public Square(double length1) {
        super(length1, 0);
    }

    @Override
    public double getArea() {
        return getLength1() * getLength1();
    }

    @Override
    public double getPerimeter() {
        return getLength1() * 4;
    }
}
