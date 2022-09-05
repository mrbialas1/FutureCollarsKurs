package com.futurecollars.lesson9.exercise3;

public abstract class Calculator {
    double number1;
    double number2;

    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public abstract double calculate();
}
