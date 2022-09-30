package com.futurecollars.lesson9.exercise3;

public class ExtendedCalculator {
    public double calculate(double number1, double number2, MathOperation mathOperation) {
        Calculator calculator = null;
        switch (mathOperation) {
            case ADDITION:
                calculator = new Addition();
                break;
            case SUBTRACTION:
                calculator = new Subtraction();
                break;
            case MULTIPLICATION:
                calculator = new Multiplication();
                break;
            case DIVISION:
                calculator = new Division();
                break;
            case ROOT:
                calculator = new Root();
                break;
            case TO_THE_POWER_OF:
                calculator = new ToThePowerOf();
                break;
            default:
                System.out.println("Nie ma takiej operacji");

        }
        return calculator.calculate(number1, number2);
    }
}
