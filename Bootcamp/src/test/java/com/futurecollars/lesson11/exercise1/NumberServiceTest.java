package com.futurecollars.lesson11.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberServiceTest {
    @ParameterizedTest
    @ValueSource(ints = {246, 6124, 18562, 0, 100})
    public void shouldReturnEvenStatement(int input) {
        //given
        NumberService numberService = new NumberService();
        //when
        boolean answer = numberService.isEven(input);
        //then
        Assertions.assertTrue(answer);
    }

    @ParameterizedTest
    @CsvSource(value = {"6123 :12", " 18567:27", " 100 :1"}, delimiter = ':')
    void shouldDoAdditionOfEveryNumberDigit(int input, int expected) {
        //given
        NumberService numberService = new NumberService();
        //when
        int answerValue = numberService.addEveryDigitOfNumber(input);
        //then
        Assertions.assertEquals(expected, answerValue);
    }
}
