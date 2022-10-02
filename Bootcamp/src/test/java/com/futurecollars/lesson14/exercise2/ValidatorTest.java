package com.futurecollars.lesson14.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ValidatorTest {
    @ParameterizedTest
    @MethodSource("providePeselsToValidate")
    void shouldVerifyPeselIsGood(String input, boolean expected) {
        //given
        Validator validator = new Validator();
        //when
        boolean isGoodPesel = validator.validatePesel(input);
        //then
        Assertions.assertEquals(expected, isGoodPesel);
    }

    private static Stream<Arguments> providePeselsToValidate() {
        return Stream.of(
                Arguments.of("0987654321q", false),
                Arguments.of("09876543212", true),
                Arguments.of("12345a09876", false)
        );
    }
}