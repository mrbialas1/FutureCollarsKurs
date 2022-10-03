package com.futurecollars.lesson10.exercise10;

public class Main{
    public static void main(String[] args) {
        int[] table = new int[]{3, 5, 9, 11, 12};
        ByThreeDivisibilityValidator validator = new ByThreeDivisibilityValidator();
        validator.byThreeDivisibilityValidation(table);
    }
}
