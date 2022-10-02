package com.futurecollars.lesson14.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ValidatorTest {
    @ParameterizedTest
    @MethodSource("providePasswordsToValidate")
    void shouldVerifyPasswordIsGoodEnough(String input, int expected) {
        //given
        Validator validator = new Validator();
        //when
        int actualValue = validator.validatePassword(input);
        //then
        Assertions.assertEquals(expected, actualValue);
    }

    private static Stream<Arguments> providePasswordsToValidate() {
        return Stream.of(
                Arguments.of("Password1", 1),
                Arguments.of("pa2022sworD", 2),
                Arguments.of("passwor1", 5),
                Arguments.of("passworD", 4),
                Arguments.of("Pass1", 3)
        );
    }

}