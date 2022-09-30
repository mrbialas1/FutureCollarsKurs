package com.futurecollars.lesson8.exercise2;

public class Rectangle extends Square {
    private final double side2;

    public Rectangle(double side, double side2) {
        super(side);
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return getSide() * side2;
    }

    @Override
    public double getPerimeter() {
        return getSide() * 2 + side2 * 2;
    }
}
