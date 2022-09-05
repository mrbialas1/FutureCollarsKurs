package com.futurecollars.lesson8.exercise6;

public class CalculateWithDiscount extends BillCalculator{
    float discount; //%

    public CalculateWithDiscount(double bill, float servicePayment) {
        super(bill, servicePayment);
    }

    @Override
    public double calculate() {
        return bill + servicePayment - bill*discount;
    }
}
