package com.futurecollars.lesson11.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TrainingTest {
    @ParameterizedTest
    @MethodSource("provideStringsForTrimAndInLowerCase")
    void shouldVerifyStringTrimAndInLowerCase(int input1, int input2, int input3, double expected) {
        //given
        int[][] tableOfTraining = {{input1, 30, 60}, {input2, 300, 400}, {input3, 160, 175}};
        Training training = new Training();
        //when
        int[] parameters = training.giveParametersDegree(tableOfTraining);
        double result = training.weightedAverage(parameters);
        //then
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> provideStringsForTrimAndInLowerCase() {
        return Stream.of(
                Arguments.of(20, 450, 140, (double) 5 / 3),
                Arguments.of(80, 500, 180, 3),
                Arguments.of(20, 30, 165, (double) 4 / 3)
        );
    }
}