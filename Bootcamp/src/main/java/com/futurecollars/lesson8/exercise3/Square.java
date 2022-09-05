package com.futurecollars.lesson8.exercise3;

public class Square implements AreaAndPerimeter{
    @Override
    public double countArea(double side) {
        return side*side;
    }

    @Override
    public double countPerimeter(double side) {
        return 4*side;
    }
}
