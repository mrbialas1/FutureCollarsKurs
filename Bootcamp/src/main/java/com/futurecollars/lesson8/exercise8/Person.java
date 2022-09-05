package com.futurecollars.lesson8.exercise8;

import java.util.Objects;

public class Person {
    String name;
    String surname;
    int age;
    boolean marriedRelationship;
    public Person(String name, String surname, int age, boolean marriedRelationship){
        this.name = name;
        this.surname= surname;
        this.age = age;
        this.marriedRelationship = marriedRelationship;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && marriedRelationship == person.marriedRelationship && name.equals(person.name) && surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, marriedRelationship);
    }
}
