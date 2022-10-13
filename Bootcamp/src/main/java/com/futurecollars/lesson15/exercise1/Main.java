package com.futurecollars.lesson15.exercise1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int from = 0;
        int to = 61;
        filterDivisionByThree(from, to)
                .forEach(System.out::println);
    }

    private static List<Integer> filterDivisionByThree(int from, int to) {
        return IntStream.range(from, to)
                .filter(in -> in % 3 == 0)
                .boxed()
                .collect(Collectors.toList());
    }
}
