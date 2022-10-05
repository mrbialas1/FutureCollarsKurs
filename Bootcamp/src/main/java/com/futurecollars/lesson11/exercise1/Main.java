package com.futurecollars.lesson11.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wprowadź liczbę");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        NumberService numberService = new NumberService();
        boolean statement = numberService.isEven(number);
        writeIsDivisibleOfTwo(number, statement);
        int answer = numberService.addEveryDigitOfNumber(number);
        System.out.println("Suma poszczególnych cyfr liczby wynosi " + answer);

    }

    private static void writeIsDivisibleOfTwo(int number, boolean statement) {
        if (statement) {
            System.out.println("Liczba " + number + " jest podzielna przez 2");
        } else {
            System.out.println("Liczba " + number + " nie jest podzielna przez 2");
        }
    }

}
