package com.futurecollars.lesson8.exercise3;

public class Circle implements AreaAndPerimeter{
    @Override
    public double countArea(double radius) {
        return Math.PI*radius*radius;
    }

    @Override
    public double countPerimeter(double radius) {
        return 2*Math.PI*radius;
    }
}
