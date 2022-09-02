package com.futurecollars.lesson7.exercise3;

public class Manager extends BaseEmployee{
    public int bonus;
    public Manager(String name, String surname, int employmentYear) {
        super(name, surname,5000, employmentYear);
    }

    @Override
    public int calculateYearsOfEmployment() {
        return 2022 - employmentYear;
    }

    @Override
    public int calculateMonthlySalary(Integer bonus) {
        basicSalary = 5000;
        return basicSalary += bonus;
    }
}
