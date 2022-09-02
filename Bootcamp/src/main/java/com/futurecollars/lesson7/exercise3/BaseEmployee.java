package com.futurecollars.lesson7.exercise3;

public abstract class BaseEmployee {
    String name;
    String surname;
    int basicSalary;
    int employmentYear;

    public BaseEmployee(String name, String surname,int basicSalary, int employmentYear){
        this.name = name;
        this.surname = surname;
        this.basicSalary = basicSalary;
        this.employmentYear = employmentYear;
    }
    public abstract int calculateYearsOfEmployment();

    public abstract int calculateMonthlySalary(Integer bonus);
}
