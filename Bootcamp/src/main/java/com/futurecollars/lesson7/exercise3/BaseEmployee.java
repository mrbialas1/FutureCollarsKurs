package com.futurecollars.lesson7.exercise3;

public abstract class BaseEmployee {
    private final String name;
    private final String surname;
    private final int basicSalary;
    private final int employmentYear;
    private int bonus;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }

    public int getBonus() {
        return bonus;
    }

    public BaseEmployee(String name, String surname, int basicSalary, int employmentYear, int bonus) {
        this.name = name;
        this.surname = surname;
        this.basicSalary = basicSalary;
        this.employmentYear = employmentYear;
        this.bonus = bonus;
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
