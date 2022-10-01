package com.futurecollars.lesson10.exercise10;

public class ByThreeDivisibilityValidator {
    public static void byThreeDivisibilityValidation(int[] number) throws java.lang.IllegalArgumentException {
        for (int i : number) {
            try {
                if (i % 3 != 0) {
                    throw new IllegalArgumentException("Liczba nie jest podzielna przez 3");
                }
                System.out.println(i);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }
}
