package com.futurecollars.lesson14.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.Period;
import java.util.stream.Stream;

class DateOfBirthTest {
    @ParameterizedTest
    @MethodSource("provideDateToFindYearWeek")
    void shouldReturnWeekOfYearByDate(int input1, int input2, int input3, long expected) {
        //given
        LocalDate date = LocalDate.of(input1, input2, input3);
        DateOfBirth dateOfBirth = new DateOfBirth();
        //when
        long weekOfBirth = dateOfBirth.findWhichWeekOfYear(date);
        //then
        Assertions.assertEquals(expected, weekOfBirth);
    }

    private static Stream<Arguments> provideDateToFindYearWeek() {
        return Stream.of(
                Arguments.of("1998", "2", "4", "5"),
                Arguments.of("1998", "2", "22", "7")
        );
    }

    @ParameterizedTest
    @MethodSource("provideDateToCountYearsOld")
    void shouldReturnPersonYearsOld(int input1, int input2, int input3, int expected) {
        //given
        LocalDate date = LocalDate.of(input1, input2, input3);
        DateOfBirth dateOfBirth = new DateOfBirth();
        Period period = dateOfBirth.countYearsOld(date);
        //when
        int yearsOld = period.getYears();
        //then
        Assertions.assertEquals(expected, yearsOld);
    }

    private static Stream<Arguments> provideDateToCountYearsOld() {
        return Stream.of(
                Arguments.of("1998", "2", "4", "24"),
                Arguments.of("1998", "2", "22", "24")
        );
    }

    @ParameterizedTest
    @MethodSource("provideDateToFindWeekDay")
    void shouldReturnDayOfWeek(int input1, int input2, int input3, String expected) {
        //given
        LocalDate date = LocalDate.of(input1, input2, input3);
        DateOfBirth dateOfBirth = new DateOfBirth();
        //when
        String weekDayOfBirth = String.valueOf(dateOfBirth.findWhichDayOfWeek(date));
        //then
        Assertions.assertEquals(expected, weekDayOfBirth);
    }

    private static Stream<Arguments> provideDateToFindWeekDay() {
        return Stream.of(
                Arguments.of("1998", "2", "4", "WEDNESDAY"),
                Arguments.of("1998", "2", "22", "SUNDAY")
        );
    }
}