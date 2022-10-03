package com.futurecollars.lesson10.exercise10;

public class ByThreeDivisibilityValidator {
    public void byThreeDivisibilityValidation(int[] number){
        for (int i : number) {
            try {
                if (i % 3 != 0) {
                    throw new IllegalArgumentException(String.format("Liczba %s nie jest podzielna przez 3", i));
                }
                System.out.println(i);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }
}
