package com.futurecollars.lesson15.exercise1;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int from = 0;
        int to = 61;
        filterDivisionByThree(from, to);
    }

    private static void filterDivisionByThree(int from, int to) {
        IntStream ints = IntStream.range(from, to);
         ints
                .filter(in -> in % 3 == 0)
                .forEach(System.out::println);
    }
}
