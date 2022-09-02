package com.futurecollars.lesson6.exercise5;

import com.futurecollars.lesson6.exercise5.Parity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParityTest {
    @Test
    void shouldBeTrue() {
        //given
        int number = 2;
        //when
        boolean parity =Parity.parityChecking(number);
        //then
        Assertions.assertTrue(parity);
    }
    @Test
    void shouldBeFalse() {
        //given
        int number = -1;
        //when
        boolean parity =Parity.parityChecking(number);
        //then
        Assertions.assertFalse(parity);
    }
}
