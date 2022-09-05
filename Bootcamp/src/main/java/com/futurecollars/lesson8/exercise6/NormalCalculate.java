package com.futurecollars.lesson8.exercise6;

public class NormalCalculate extends  BillCalculator{

    public NormalCalculate(double bill, float servicePayment) {
        super(bill, servicePayment);
    }

    @Override
    public double calculate() {
        return bill + servicePayment;
    }
}
