package com.futurecollars.lesson7.exercise4;

import java.util.Scanner;

import static com.futurecollars.lesson7.exercise4.Conversion.convertToSeconds;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wprowadź czas w minutach");
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();
        int seconds = convertToSeconds(minutes);
        System.out.println(minutes +" minut to " + seconds + " sekund");
    }
}
