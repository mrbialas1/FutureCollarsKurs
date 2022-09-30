package com.futurecollars.lesson10.exercise8;

import java.util.Scanner;

public class Main extends Elemental {
    public static void main(String[] args) {
        System.out.println("Wprowadź liczbę nieujemną do obliczenia jej pierwiastka");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextInt();
        double answer = doElemental(number);
        if (answer != 0) {
            System.out.println("Rozwiązaniami są: " + answer + " oraz " + -answer);
        } else {
            System.out.println("Rozwiązaniem jest: 0");
        }
    }
}

