package com.futurecollars.lesson11.exercise7;

public class Calculator {
    private final double bonus;
    private final int saturdaysWorked;
    private final VariablePayments variablePayments;

    public double getBonus() {
        return bonus;
    }

    public int getSaturdaysWorked() {
        return saturdaysWorked;
    }

    public Calculator(double bonus, int saturdaysWorked, VariablePayments variablePayments) {
        this.bonus = bonus;
        this.saturdaysWorked = saturdaysWorked;
        this.variablePayments = variablePayments;
    }

    public double calculateFinalSalary(double bonus, int saturdaysWorked, VariablePayments variablePayments) {
        return variablePayments.basicSalary() + bonus + variablePayments.saturdayWorkBonus() + saturdaysWorked;
    }
}
