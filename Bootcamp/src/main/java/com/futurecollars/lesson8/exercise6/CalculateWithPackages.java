package com.futurecollars.lesson8.exercise6;

public class CalculateWithPackages extends BillCalculator {
    float packages;

    public CalculateWithPackages(double bill, float servicePayment) {
        super(bill, servicePayment);
    }

    @Override
    public double calculate() {
        return bill + servicePayment + packages;
    }
}
