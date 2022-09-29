package com.futurecollars.lesson7.exercise5;

public class PythagoreanTheorem {
    public static boolean IsTriangleRectangular(int side1, int side2, int side3) {
        int[] table = new int[]{side1, side2, side3};
        int number = getLongestSide(table);
        int ShorterSidesSumOfSquares = getShorterSidesSumOfSquares(table, number);
        return (table[number] ^ 2) == ShorterSidesSumOfSquares;
    }

    private static int getShorterSidesSumOfSquares(int[] table, int number) {
        int ShorterSidesSumOfSquares = 0;
        for (int i = 0; i < 3; i++) {
            if (i != number) {
                ShorterSidesSumOfSquares += table[i] ^ 2;
            }
        }
        return ShorterSidesSumOfSquares;
    }

    public static int getLongestSide(int[] table) {
        int number = 0;
        int max = table[0];
        for (int i = 0; i < 3; i++) {
            if (table[i] > max) {
                max = table[i];
                number = i;
            }
        }
        return number;
    }
}
