package com.futurecollars.lesson12.exercise4;

import java.util.Comparator;

public class Person implements Comparator<Person> {
    private final String name;
    private final String surname;
    private final int birthYear;
    private final int height;
    private final int weight;


    public Person(String name, String surname, int BirthYear, int height, int weight) {
        this.surname = surname;
        this.birthYear = BirthYear;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.birthYear, o2.birthYear);
    }

    public String getSurname() {
        return surname;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getName() {
        return name;
    }
}