package com.futurecollars.lesson6.exercise5;

import static com.futurecollars.lesson6.exercise5.ParityChecking.isNumberEven;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wprowadź liczbę całkowitą");
        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();
        boolean parity = isNumberEven(integer);
        if (parity) {
            System.out.println("Parzysta");
        } else {
            System.out.println("Nieparzysta");
        }
    }
}
