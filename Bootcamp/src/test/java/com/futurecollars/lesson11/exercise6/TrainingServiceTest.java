package com.futurecollars.lesson11.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TrainingServiceTest {
    @ParameterizedTest
    @MethodSource("provideParametersFromTraining")
    void shouldMakeGradeOfTraining(int caloriesBurnt, int trainingLength, int averageHeartRate, TrainingEffectiveness expected) {
        //given
        CaloriesBurntService caloriesBurntService = new CaloriesBurntService();
        TrainingLengthService trainingLengthService = new TrainingLengthService();
        AverageHeartRateService averageHeartRateService = new AverageHeartRateService();
        TrainingService trainingService = new TrainingService(caloriesBurntService,trainingLengthService,averageHeartRateService);
        //when
        TrainingEffectiveness result = trainingService.rateTraining(caloriesBurnt,trainingLength,averageHeartRate);
        //then
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> provideParametersFromTraining() {
        return Stream.of(
                Arguments.of(450, 20, 140, TrainingEffectiveness.DOBRA),
                Arguments.of(500, 80, 180, TrainingEffectiveness.DOSKONALA),
                Arguments.of(600, 20, 165, TrainingEffectiveness.BARDZODOBRA),
                Arguments.of(300, 50, 155, TrainingEffectiveness.NISKA)
        );
    }
}