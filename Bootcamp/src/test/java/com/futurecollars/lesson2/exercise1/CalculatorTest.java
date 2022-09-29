package com.futurecollars.lesson2.exercise1;

import com.futurecollars.lesson6.exercise1.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void shouldAddTwoValues1and1() {
        //given
        int number1 = 1;
        int number2 = 1;
        //when
        double sum = Calculator.sum(number1, number2);
        //then
        Assertions.assertEquals(2, sum);
    }

    @Test
    void shouldSubtractTwoValues1and1() {
        //given
        int number1 = 1;
        int number2 = 1;
        //when
        double sub = Calculator.sub(number1, number2);
        //then
        Assertions.assertEquals(0, sub);
    }

    @Test
    void shouldMultiplyTwoValues1and1() {
        //given
        int number1 = 1;
        int number2 = 1;
        //when
        double mul = Calculator.mul(number1, number2);
        //then
        Assertions.assertEquals(1, mul);
    }

    @Test
    void shouldDivideTwoValues1and1() {
        //given
        int number1 = 1;
        int number2 = 1;
        //when
        double div = Calculator.div(number1, number2);
        //then
        Assertions.assertEquals(1, div);
    }
}
