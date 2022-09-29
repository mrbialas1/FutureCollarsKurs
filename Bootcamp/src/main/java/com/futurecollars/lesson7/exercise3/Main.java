package com.futurecollars.lesson7.exercise3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wprowadż zmianę bonusu dla managera");
        Manager manager = new Manager("Jan", "Kowalski", 2008, 500);
        manager.setBonus(300);
        TicketSeller ticketSeller = new TicketSeller("Jakub", "Nowak", 2014);
        System.out.println(manager.toString());
        System.out.println(ticketSeller.toString());
    }


}
