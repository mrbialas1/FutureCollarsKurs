package com.futurecollars.lesson14.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ValidatorTest {
    @ParameterizedTest
    @MethodSource("provideUrlAddressesToValidate")
    void shouldVerifyUrlAddressesCorrectness(String input, boolean expected) {
        //given
        Validator validator = new Validator();
        //when
        boolean answer = validator.validateUrlLink(input);
        //then
        Assertions.assertEquals(expected, answer);
    }

    private static Stream<Arguments> provideUrlAddressesToValidate() {
        return Stream.of(
                Arguments.of("http://www.onet.pl", true),
                Arguments.of("https://mail.google.com", true),
                Arguments.of("http://wiadmosci.onet.pl", true),
                Arguments.of("http://onet.pl", true),
                Arguments.of("onet.plhttp://", false)
        );
    }
}