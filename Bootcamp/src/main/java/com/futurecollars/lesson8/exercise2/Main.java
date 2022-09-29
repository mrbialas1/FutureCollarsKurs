package com.futurecollars.lesson8.exercise2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(2, 3, 4, 5);
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
