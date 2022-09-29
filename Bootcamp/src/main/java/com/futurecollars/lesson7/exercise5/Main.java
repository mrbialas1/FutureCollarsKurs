package com.futurecollars.lesson7.exercise5;

import java.util.Scanner;

import static com.futurecollars.lesson7.exercise5.PythagoreanTheorem.IsTriangleRectangular;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wprowadź wymiary wszystkich trzech boków trójkąta odzielając każdy klawiszem \"Enter\"");
        Scanner sc1 = new Scanner(System.in);
        int side1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int side2 = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        int side3 = sc3.nextInt();
        System.out.println("Wymiary boków: " + side1 + ", " + side2 + " i " + side3);
        boolean rectangular = IsTriangleRectangular(side1, side2, side3);
        if (rectangular) {
            System.out.println("Trójkąt jest prostokątny");
        } else {
            System.out.println("Trójkąt nie jest prostokątny");
        }
    }
}
