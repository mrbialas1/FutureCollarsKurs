package com.futurecollars.lesson7.exercise3;

public abstract class BaseEmployee {
    private final String name;
    private final String surname;
    private final int basicSalary;
    private final int employmentYear;

    public int getBasicSalary() {
        return basicSalary;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }


    public BaseEmployee(String name, String surname, int basicSalary, int employmentYear) {
        this.name = name;
        this.surname = surname;
        this.basicSalary = basicSalary;
        this.employmentYear = employmentYear;
    }

    public abstract int calculateYearsOfEmployment();

    public abstract int calculateMonthlySalary();

    @Override
    public String toString() {
        return "Pracownik{" +
                "Imię='" + name + '\'' +
                ", Nazwisko='" + surname + '\'' +
                ", Miesięczna płaca=" + basicSalary +
                ", Miesięczna płaca z bonusem: " + calculateMonthlySalary() +
                ", Lata zatrudnienia=" + calculateYearsOfEmployment() +
                '}';
    }
}
