package com.futurecollars.lesson8.exercise2;

public class Triangle extends Shape {
    private final double length1;
    private final double length2;
    private final double length3;
    private final double height;

    public Triangle(double length1, double length2, double length3, double height) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
        this.height = height;
    }

    @Override
    public double getArea() {
        return length1 * height / 2;
    }

    @Override
    public double getPerimeter() {
        return length1 + length2 + length3;
    }
}
