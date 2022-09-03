package com.futurecollars.lesson8.exercise2;

public class Rectangle extends Triangle{
    double side4Length=6;
    @Override
    public double getArea() {
        return super.getArea()*2;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter()+side4Length;
    }
}
