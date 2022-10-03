package com.futurecollars.lesson9.exercise3;

public class Root implements Calculator {
    @Override
    public double calculate(double number1, double number2) {
        return Math.pow(number1, 1 / number2);
    }
}
