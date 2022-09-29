package com.futurecollars.lesson8.exercise3;

public class Circle implements AreaAndPerimeter {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double countArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double countPerimeter() {
        return 2 * Math.PI * getRadius();
    }
}
