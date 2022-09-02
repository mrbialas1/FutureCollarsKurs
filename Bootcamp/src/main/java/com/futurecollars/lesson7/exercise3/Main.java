package com.futurecollars.lesson7.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wprowadź bonus dla managera");
        Scanner sc = new Scanner(System.in);
        Integer bonus = sc.nextInt();
        Manager manager = new Manager("Jan", "Kowalski", 2008);
        TicketSeller ticketSeller = new TicketSeller("Jakub", "Nowak", 2014);
        writeInformation(manager, bonus);
        System.out.println();
        writeInformation(ticketSeller, null);
    }
    public static void writeInformation(BaseEmployee baseEmployee, Integer bonus) {
        System.out.println("Imię: " + baseEmployee.name +"\nNazwisko: " + baseEmployee.surname + "\nMiesięczna płaca: "
                + baseEmployee.basicSalary + "\nMiesięczna płaca z bonusem: " + baseEmployee.calculateMonthlySalary(bonus)
                + "\nLata zatrudnienia: " + baseEmployee.calculateYearsOfEmployment());
    }
}
