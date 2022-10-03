package com.futurecollars.lesson9.exercise3;

public class ToThePowerOf implements Calculator {
    @Override
    public double calculate(double number1, double number2) {
        return Math.pow(number1, number2);
    }
}
