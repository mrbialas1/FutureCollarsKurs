package com.futurecollars.lesson9.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wprowadż tekst");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        processText(text);

    }

    public static void processText(String text) {
        if (text.length() == 0) {
            System.out.println("Brak znaków");
        } else {
            System.out.println("Tekst posiada znaki");
            boolean palindrome = isPalindrome(text);
            printIsPalindrome(palindrome);
            System.out.println("Długośc tekstu wynosi " + text.length() + " znaków");
        }
    }

    private static void printIsPalindrome(boolean palindrome) {
        if (palindrome) {
            System.out.println("Tekst jest palindromem");
        } else {
            System.out.println("Tekst nie jest palindromem");
        }
    }

    private static boolean isPalindrome(String text) {
        boolean isPalindrome = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == text.charAt(text.length() - i - 1)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
