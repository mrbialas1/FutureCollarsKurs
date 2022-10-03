package com.futurecollars.lesson10.exercise8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ElementalTest {
    @Test
    void shouldAnswerToElemental() {
        //given
        double number = 4;
        Elemental elemental = new Elemental();
        //when
        double answer = elemental.doElemental(number);
        //then
        Assertions.assertEquals(2, answer);
    }
}
