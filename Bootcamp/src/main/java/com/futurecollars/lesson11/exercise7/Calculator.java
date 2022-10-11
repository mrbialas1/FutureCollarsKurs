package com.futurecollars.lesson11.exercise7;

public class Calculator implements Salary, SaturdaysWork {
    private final double bonus;
    private final int saturdaysWorked;

    @Override
    public int basicSalary() {
        return 3000;
    }

    @Override
    public int saturdaysWorkBonus() {
        return 250;
    }

    public double getBonus() {
        return bonus;
    }

    public int getSaturdaysWorked() {
        return saturdaysWorked;
    }

    public Calculator(double bonus, int saturdaysWorked) {
        this.bonus = bonus;
        this.saturdaysWorked = saturdaysWorked;
    }

    public double calculateFinalSalary(double bonus, int saturdaysWorked, double basicSalary, double saturdayWorkBonus) {
        return basicSalary + bonus + saturdayWorkBonus * saturdaysWorked;
    }
}
