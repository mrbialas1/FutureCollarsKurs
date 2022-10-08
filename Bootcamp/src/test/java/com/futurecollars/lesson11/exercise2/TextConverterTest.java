package com.futurecollars.lesson11.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class TextConverterTest {
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"radar", "anna", "kayak", "wow"})
    void shouldConvertTextToUpperCases(String input) {
        //given
        TextConverter textConverter = new TextConverter();
        //when
        String upperCases = textConverter.textToUpperCases(input);
        //then
        if (input == null) {
            input = "";
        }
        Assertions.assertEquals(input.toUpperCase(), upperCases);
    }
}