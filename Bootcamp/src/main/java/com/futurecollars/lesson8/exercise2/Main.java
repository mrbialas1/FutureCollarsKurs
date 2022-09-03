package com.futurecollars.lesson8.exercise2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        double rectangleArea = rectangle.getArea();
        double rectanglePerimeter = rectangle.getPerimeter();
        System.out.println(rectangleArea);
        System.out.println(rectanglePerimeter);
        double triangleArea = triangle.getArea();
        double trianglePerimeter = triangle.getPerimeter();
        System.out.println(triangleArea);
        System.out.println(trianglePerimeter);
    }
}
