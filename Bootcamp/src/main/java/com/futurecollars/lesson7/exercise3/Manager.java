package com.futurecollars.lesson7.exercise3;

import java.util.Scanner;

public class Manager extends BaseEmployee {
    private int bonus;

    public int getBonus() {
        Scanner sc = new Scanner(System.in);
        return bonus = sc.nextInt();
    }

    public Manager(String name, String surname, int employmentYear, int bonus) {
        super(name, surname, 5000, employmentYear, bonus);
    }

    @Override
    public int calculateYearsOfEmployment() {
        return 2022 - getEmploymentYear();
    }

    @Override
    public int calculateMonthlySalary() {
        return getBasicSalary() + getBonus();
    }

}
