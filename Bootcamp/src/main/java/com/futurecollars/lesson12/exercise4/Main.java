package com.futurecollars.lesson12.exercise4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("All Persons sorted by height");
        Set<Person> persons1 = new TreeSet<>(Comparator.comparingInt(Person::getHeight));
        enterAllPersons(persons1);
        System.out.println("All Persons sorted by weight");
        Set<Person> persons2 = new TreeSet<>((o1, o2) -> Integer.compare(o2.getWeight(), o1.getWeight()));
        enterAllPersons(persons2);
        System.out.println("All Persons sorted by years old");
        Set<Person> persons = new TreeSet<>();
        enterAllPersons(persons);
    }

    private static void enterAllPersons(Set<Person> persons) {
        persons.add(new Person("Ania", "Nowak", 2004, 160, 60));
        persons.add(new Person("Ola", "Kowalska", 1984, 169, 75));
        persons.add(new Person("Kasia", "Smith", 2000, 175, 54));
        persons.add(new Person("Tomasz", "Michalak", 2002, 162, 72));
        for (Person per : persons) {
            System.out.println("Hello I'm " + per.getName() + " " + per.getSurname() + " born in " +
                    per.getBirthYear() + " with height " + per.getHeight() + "cm and weight " + per.getWeight() + "kg.");
        }
    }
}
