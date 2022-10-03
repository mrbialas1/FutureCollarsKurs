package com.futurecollars.lesson9.exercise3;

public class Main {
    public static void main(String[] args) {
        ExtendedCalculator extendedCalculator = new ExtendedCalculator();
        System.out.println(extendedCalculator.calculate(3, 3, MathOperation.TO_THE_POWER_OF));
        System.out.println(extendedCalculator.calculate(3, 3, MathOperation.ROOT));
        System.out.println(extendedCalculator.calculate(3, 3, MathOperation.ADDITION));
        System.out.println(extendedCalculator.calculate(3, 3, MathOperation.SUBTRACTION));
        System.out.println(extendedCalculator.calculate(3, 3, MathOperation.MULTIPLICATION));
        System.out.println(extendedCalculator.calculate(3, 3, MathOperation.DIVISION));
    }
}
