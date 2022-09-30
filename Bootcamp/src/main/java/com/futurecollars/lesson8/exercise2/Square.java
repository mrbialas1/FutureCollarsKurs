package com.futurecollars.lesson8.exercise2;

public class Square extends Shape {
    private final double side;

    public double getSide() {
        return side;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
}
