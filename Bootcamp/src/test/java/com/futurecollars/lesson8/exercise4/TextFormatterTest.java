package com.futurecollars.lesson8.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextFormatterTest {
    @Test
    void shouldBeUpperCase() {
        //given
        String text = "RóŻnE wIeLkOśCi LiTeR";
        UpperCase upperCase = new UpperCase();
        //when
        String toUpperCase = upperCase.formatText(text);
        //then
        Assertions.assertEquals("RÓŻNE WIELKOŚCI LITER", toUpperCase);
    }
    @Test
    void shouldBeLowerCase() {
        //given
        String text = "RóŻnE wIeLkOśCi LiTeR";
        LowerCase lowerCase = new LowerCase();
        //when
        String toLowerCase= lowerCase.formatText(text);
        //then
        Assertions.assertEquals("różne wielkości liter", toLowerCase);
    }
}
