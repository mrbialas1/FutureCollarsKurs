package com.futurecollars.lesson12.exercise1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Katarzyna", "Tymon", "Anna", "Karolina", "Dorota", "Piotr");
        writeNamesWithoutDuplicates(names);
        System.out.println();
        WriteNamesInOppositeOrder(names);
        System.out.println();
        String startName = "Anna";
        String endName = "Joanna";
        checkChangingIsAvaible(names, startName, endName);
        writeListOfNames(names);
    }

    private static void checkChangingIsAvaible(List<String> names, String startName, String endName) {
        if (names.contains(startName)) {
            changeName(names, startName, endName);
        } else System.out.printf("Nie ma takiego imienia jak %s żeby je zmienić", startName);
        System.out.println();
    }

    private static void writeListOfNames(List<String> names) {
        for (String j : names) {
            System.out.println(j);
        }
    }

    private static void changeName(List<String> names, String startName, String endName) {
        for (int i = 0; i < names.size(); i++) {
            if (Objects.equals(names.get(i), startName)) {
                names.set(i, endName);
            }
        }
    }


    private static void WriteNamesInOppositeOrder(List<String> names) {
        for (int i = names.size(); i > 0; i--) {
            System.out.println(names.get(i - 1));
        }
    }

    private static void writeNamesWithoutDuplicates(List<String> names) {
        Set<String> noDuplicateNames = Set.copyOf(names);
        for (String j : noDuplicateNames) {
            System.out.println(j);
        }
    }
}
