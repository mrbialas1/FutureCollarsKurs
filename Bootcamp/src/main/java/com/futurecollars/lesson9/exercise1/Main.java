package com.futurecollars.lesson9.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wprowadż tekst");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("tekst: ");
        boolean palindrome = false;
        if(text.length()==0){
            System.out.println("Brak znaków");
        }
        else{
            System.out.println("Tekst posiada znaki");
            for (int i = 0; i < text.length(); i++) {
                if(text.charAt(i)==text.charAt(text.length()-i-1)){
                    palindrome = true;
                }
                else {
                    palindrome = false;
                    break;
                }
            }
            if(palindrome){
                System.out.println("Tekst jest palindromem");
            }
            else {
                System.out.println("Tekst nie jest palindromem");
            }
            System.out.println("Długośc tekstu wynosi " + text.length() + " znaków");
        }

    }
}
