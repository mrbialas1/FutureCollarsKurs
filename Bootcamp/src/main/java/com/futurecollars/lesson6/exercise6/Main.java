package com.futurecollars.lesson6.exercise6;
import java.util.Scanner;
import static com.futurecollars.lesson6.exercise6.Week.weekDayThrower;

public class Main {
    public static void main(String[] args) {
        System.out.println("podaj liczbę całkowitą odpowiadającą dniu tygodnia (od 1 do 7) ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String day=weekDayThrower(number);
        System.out.println(day);
    }
}
