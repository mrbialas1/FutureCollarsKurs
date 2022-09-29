package com.futurecollars.lesson6.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeekConverterTest {
    @Test
    void shouldBeWorkDay() {
        //given
        String[] inWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        int number = 2;
        int tableNumber = number - 1;
        //when
        String day = WeekConverter.convertNumberToWeekDay(number);
        //then
        Assertions.assertEquals(inWeek[tableNumber], day);
    }

    @Test
    void shouldBeWeekend() {
        //given
        int number = 6;
        //when
        String day = WeekConverter.convertNumberToWeekDay(number);
        //then
        Assertions.assertEquals("Weekend", day);
    }

    @Test
    void shouldBeWrongDay() {
        //given
        int number = 9;
        //when
        String day = WeekConverter.convertNumberToWeekDay(number);
        //then
        Assertions.assertEquals("There is no such a day!", day);
    }
}
