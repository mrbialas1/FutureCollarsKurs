package com.futurecollars.lesson7.exercise3;

public class Manager extends BaseEmployee {
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, String surname, int employmentYear, int bonus) {
        super(name, surname, 5000, employmentYear);
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
