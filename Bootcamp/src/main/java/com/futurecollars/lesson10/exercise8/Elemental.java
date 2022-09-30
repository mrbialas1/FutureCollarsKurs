package com.futurecollars.lesson10.exercise8;

public class Elemental {
    public static double doElemental(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Liczba nie może być mniejsza od 0");
        }
        return Math.sqrt(number);
    }
}
