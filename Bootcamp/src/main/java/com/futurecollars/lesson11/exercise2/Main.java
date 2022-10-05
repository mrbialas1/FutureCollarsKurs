package com.futurecollars.lesson11.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wprowadź tekst");
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        text=null;
        TextConverter textConverter = new TextConverter();
        String upperCases = textConverter.textToUpperCases(text);
        System.out.println(upperCases);
    }
}
