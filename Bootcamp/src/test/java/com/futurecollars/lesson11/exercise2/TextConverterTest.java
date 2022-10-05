package com.futurecollars.lesson11.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.fail;

class TextConverterTest{
    @ParameterizedTest
    @ValueSource(strings = {"radar", "anna", "kayak", "wow", ""})
    void shouldConvertTextToUpperCases(String input) {
        //given
        TextConverter textConverter = new TextConverter();
        //when
        String upperCases = textConverter.textToUpperCases(input);
        //then
        Assertions.assertEquals(input.toUpperCase(), upperCases);
    }
    @Test
    void shouldThrowNullException() {
        //given
        String text = null;
        TextConverter textConverter = new TextConverter();
        //when
        fail(textConverter.textToUpperCases(text));
        //then
        Assertions.assertEquals("java.lang.NullPointerException", fail(textConverter.textToUpperCases(text)));
    }

}