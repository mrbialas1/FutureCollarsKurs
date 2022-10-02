package com.futurecollars.lesson14.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class NumbersTest {
    @ParameterizedTest
    @MethodSource("provideNumbersToDefineInCategories")
    void shouldDefineNumberCategory(String input, String expected) {
        //given
        Numbers numbers = new Numbers();
        //when
        String answer = numbers.divisionOfNumbersIntoCategories(input);
        //then
        Assertions.assertEquals(expected, answer);
    }

    private static Stream<Arguments> provideNumbersToDefineInCategories() {
        return Stream.of(
                Arguments.of("342", "INTEGERS"),
                Arguments.of("5.34", "FLOATING"),
                Arguments.of("756", "INTEGERS"),
                Arguments.of("1.234e+07", "SCIENTIFIC"),
                Arguments.of("7.234243E-02", "SCIENTIFIC"),
                Arguments.of("6.09", "FLOATING"),
                Arguments.of("3457", "INTEGERS"),
                Arguments.of("87", "INTEGERS"),
                Arguments.of("1.0001", "FLOATING"),
                Arguments.of("3", "INTEGERS"),
                Arguments.of("5", "INTEGERS")
        );
    }

}