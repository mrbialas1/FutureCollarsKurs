package com.futurecollars.lesson8.exercise2;

public abstract class Shape {
    private final double length1;
    private final double length2;
    private final double length3;
    private final double length4;

    public double getLength1() {
        return length1;
    }

    public double getLength2() {
        return length2;
    }

    public double getLength3() {
        return length3;
    }

    public double getLength4() {
        return length4;
    }

    public Shape(double length1, double length2, double length3, double length4) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
        this.length4 = length4;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

