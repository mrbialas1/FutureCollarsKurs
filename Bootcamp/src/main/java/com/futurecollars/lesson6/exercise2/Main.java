package com.futurecollars.lesson6.exercise2;

import java.util.Scanner;

import static com.futurecollars.lesson6.exercise2.Majority.isMajor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean adult = isMajor(age);
        if (adult) {
            System.out.println("Aduld");
        } else {
            System.out.println("Child");
        }
    }
}
