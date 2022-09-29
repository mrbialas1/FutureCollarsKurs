package com.futurecollars.lesson6.exercise4;
import java.util.Scanner;
import static com.futurecollars.lesson6.exercise4.Majority.majorityChecking;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your actual age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean adult=majorityChecking(age);
        if(adult){
            System.out.println("Aduld");
        }
        else {
            System.out.println("Child");
        }
    }
}
