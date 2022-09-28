package com.futurecollars.lesson9.exercise2;

public class Main {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            processFizzBuzzGame(number);
        }
    }

    private static void processFizzBuzzGame(int number) {
        writeFizz(number);
        writeBuzz(number);
        writeNumber(number);
        System.out.println();
    }

    private static void writeNumber(int number) {
        if (number % 5 != 0 && number % 3 != 0) {
            System.out.print(number);
        }
    }

    private static void writeBuzz(int number) {
        if (number % 5 == 0) {
            System.out.print("Buzz");
        }
    }

    private static void writeFizz(int number) {
        if (number % 3 == 0) {
            System.out.print("Fizz");
        }
    }
}
