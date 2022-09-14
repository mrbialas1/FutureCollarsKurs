package com.futurecollars.lesson6.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class isNumberEvenTest {
    @Test
    void shouldBeTrue() {
        //given
        int number = 2;
        //when
        boolean answer = isNumberEven.parityChecking(number);
        //then
        Assertions.assertTrue(answer);
    }

    @Test
    void shouldBeFalse() {
        //given
        int number = -1;
        //when
        boolean answer = isNumberEven.parityChecking(number);
        //then
        Assertions.assertFalse(answer);
    }
}
