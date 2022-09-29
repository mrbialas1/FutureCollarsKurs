package com.futurecollars.lesson8.exercise3;

public class Square implements AreaAndPerimeter {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double countArea() {
        return getSide() * getSide();
    }

    @Override
    public double countPerimeter() {
        return 4 * getSide();
    }
}
