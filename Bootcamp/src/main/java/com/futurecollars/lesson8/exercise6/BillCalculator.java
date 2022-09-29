package com.futurecollars.lesson8.exercise6;

public class BillCalculator {
    public double calculate(double bill, float servicePayment) {
        return bill + servicePayment;
    }

    public double calculate(double bill, float servicePayment, double discount) {
        return discount * bill + servicePayment;
    }

    public double calculate(double bill, float servicePayment, short packagesPayment) {
        return bill + servicePayment + packagesPayment;
    }
}
