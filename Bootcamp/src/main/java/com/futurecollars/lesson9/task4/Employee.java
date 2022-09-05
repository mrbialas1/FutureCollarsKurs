package com.futurecollars.lesson9.task4;

import java.math.BigDecimal;

public class Employee {
    private final String name;
    private final String surname;
    private int age;
    private BigDecimal baseSalary;
    private BigDecimal bonus;
    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Employee(String name, String surname, int age) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }
    public Employee(String name, String surname, int age, BigDecimal value) {
        this.name = name;
        this.age = age;
        this.baseSalary = value;
        this.surname = surname;
    }
    public Employee(String name, int age, BigDecimal baseSalary, BigDecimal bonus, String surname) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.surname = surname;
    }
    public BigDecimal getBasicSalary() {
        return baseSalary;
    }
    public BigDecimal getBonus() {
        return bonus;
    }
    public String getEmployeeName() {
        return "Employee name : " + name + " " + surname;
    }
    public String getEmployeeDetails() {
        return "Employee details : " + name + " " + surname + " is " + age;
    }
    public BigDecimal getFinalSalary() {
        return baseSalary.add(bonus);
    }
}
