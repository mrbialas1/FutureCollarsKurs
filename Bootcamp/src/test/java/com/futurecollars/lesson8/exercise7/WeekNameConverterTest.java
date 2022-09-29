package com.futurecollars.lesson8.exercise7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.futurecollars.lesson8.exercise7.WeekNameConverter.writeDayOfWeek;

public class WeekNameConverterTest {
    @Test
    void shouldBeCorrectDay() {
        //given
        int number = 5;
        //when
        String day = writeDayOfWeek(number);
        //then
        Assertions.assertEquals("Friday", day);
    }

    @Test
    void shouldBeIncorrectDay() {
        //given
        int number = 9;
        //when
        String day = writeDayOfWeek(number);
        //then
        Assertions.assertEquals("Nie ma dnia tygodnia o takim numerze", day);
    }
}
