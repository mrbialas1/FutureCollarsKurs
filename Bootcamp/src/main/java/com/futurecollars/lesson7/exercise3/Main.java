package com.futurecollars.lesson7.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bonus = 500;
        System.out.println("Wprowadż zmianę bonusu dla managera");
        Manager manager = new Manager("Jan", "Kowalski", 2008, bonus);
        TicketSeller ticketSeller = new TicketSeller("Jakub", "Nowak", 2014);
        System.out.println(manager.toString());
        System.out.println(ticketSeller.toString());
    }


}
