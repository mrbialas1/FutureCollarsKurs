package com.futurecollars.lesson11.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wprowadź tekst");
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        writeTextLettersNumber(text);
    }

    private static void writeTextLettersNumber(String text) {
        TextConverter textConverter = new TextConverter();
        int textLength = textConverter.countTextToLength(text);
        System.out.println("Liczba liter w tekście" + textLength);
    }
}
