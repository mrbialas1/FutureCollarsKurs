package com.futurecollars.lesson6.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParityCheckingTest {
    @Test
    void shouldBeTrue() {
        //given
        int number = 2;
        //when
        boolean answer = ParityChecking.isNumberEven(number);
        //then
        Assertions.assertTrue(answer);
    }

    @Test
    void shouldBeFalse() {
        //given
        int number = -1;
        //when
        boolean answer = ParityChecking.isNumberEven(number);
        //then
        Assertions.assertFalse(answer);
    }
}
