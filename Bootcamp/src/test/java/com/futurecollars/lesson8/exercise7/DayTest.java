package com.futurecollars.lesson8.exercise7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.futurecollars.lesson8.exercise7.Day.writeDayOfWeek;

public class DayTest {
    @Test
    void shouldCountSquareArea() {
        //given

        //when
        String day =writeDayOfWeek();
        //then
        Assertions.assertEquals("Monday", day);
    }
}
