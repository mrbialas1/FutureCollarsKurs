package com.futurecollars.lesson15.exercise1;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream ints = IntStream.range(0, 61);
        ints.forEach(Main::writeWhenThreeDivision);
    }

    public static void writeWhenThreeDivision(int ints) {
        if (ints % 3 == 0) {
            System.out.println(ints);
        }
    }
}
