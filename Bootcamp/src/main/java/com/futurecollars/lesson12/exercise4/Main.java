package com.futurecollars.lesson12.exercise4;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> person = new TreeSet<>((o1, o2) -> Integer.compare(o2.getHeight(), o1.getHeight()));
        person = new TreeSet<>((o1, o2) -> Integer.compare(o2.getWeight(), o1.getWeight()));
        person = new TreeSet<>((o1, o2) -> Integer.compare(o2.getBirthYear(), o1.getBirthYear()));
        person.add(new Person("Ania", "Nowak", 2004, 160, 60));
        person.add(new Person("Ola", "Kowalska", 1984, 169, 75));
        person.add(new Person("Kasia", "Smith", 2000, 175, 54));
        person.add(new Person("Tomasz", "Michalak", 2002, 162, 72));
        for (Person per : person) {
            System.out.println("Hello I'm " + per.getName() + " " + per.getSurname() + " born in " +
                    per.getBirthYear() + " with height " + per.getHeight() + "cm and weight " + per.getWeight() + "kg.");
        }
    }
}
