package com.futurecollars.lesson11.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

class TextConverterTest {
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"radar", "anna", "kayak", "wow", ""})
    void shouldConvertTextToUpperCases(String input) {
        //given
        TextConverter textConverter = new TextConverter();
        //when
        String upperCases = textConverter.textToUpperCases(input);
        //then
        Assertions.assertEquals(input.toUpperCase(), upperCases);
    }
}