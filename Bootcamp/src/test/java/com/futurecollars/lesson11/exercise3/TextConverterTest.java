package com.futurecollars.lesson11.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TextConverterTest {
    @ParameterizedTest
    @MethodSource("provideStringsForCountTheirLength")
    void shouldVerifyStringTrimAndInLowerCase(String input, int expected) {
        //given
        TextConverter textConverter = new TextConverter();
        //when
        int actualValue = textConverter.countTextToLength(input);
        //then
        Assertions.assertEquals(expected, actualValue);
    }

    private static Stream<Arguments> provideStringsForCountTheirLength() {
        return Stream.of(
                Arguments.of("człowiek", "8"),
                Arguments.of("zwierzę", "7"),
                Arguments.of("wyrewolwerowany", "15")
        );
    }


}