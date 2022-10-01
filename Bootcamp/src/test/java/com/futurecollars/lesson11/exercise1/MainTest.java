package com.futurecollars.lesson11.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class MainTest {
    @ParameterizedTest
    @ValueSource(ints = {245, 6123, 18567, 0, 100})
    public void shouldReturnEvenStatement(int input) {
        //given
        ProblemSolve problemSolve = new ProblemSolve();
        //when
        boolean answer = problemSolve.isDivisibleOfTwo(input);
        //then
        Assertions.assertTrue(answer);
    }

    @ParameterizedTest
    @CsvSource(value = {"6123 :12", " 18567:27", " 100 :1"}, delimiter = ':')
    void shouldDoAdditionOfEveryNumberDigit(int input, int expected) {
        //given
        ProblemSolve problemSolve = new ProblemSolve();
        //when
        int answerValue = problemSolve.addEveryDigitOfNumber(input);
        //then
        Assertions.assertEquals(expected, answerValue);
    }
}
