package com.futurecollars.lesson8.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BillCalculatorTest {
    @Test
    void shouldBeEqual() {
        //given
        double bill = 1000;
        float servicePayment = 500;
        double discount = 0.8;
        BillCalculator billCalculator = new BillCalculator();
        //when
        double finalBill = billCalculator.calculate(bill, servicePayment, discount);
        //then
        Assertions.assertEquals(1300, finalBill);
    }

}
