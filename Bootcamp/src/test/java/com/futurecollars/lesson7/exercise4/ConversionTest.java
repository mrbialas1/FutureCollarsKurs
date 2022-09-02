package com.futurecollars.lesson7.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.futurecollars.lesson7.exercise4.Conversion.convertToSeconds;

public class ConversionTest {
    @Test
    void shouldBeEqualTime() {
        //given
        int minutes =10;
        //when
        int seconds = convertToSeconds(minutes);
        //then
        Assertions.assertEquals(600,seconds);
    }
}
