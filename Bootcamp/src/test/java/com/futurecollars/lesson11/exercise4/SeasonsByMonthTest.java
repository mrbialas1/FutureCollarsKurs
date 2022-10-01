package com.futurecollars.lesson11.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SeasonsByMonthTest {
    @ParameterizedTest
    @MethodSource("provideMonthsForChooseSeason")
    void shouldVerifyStringTrimAndInLowerCase(String input, String expected) {
        SeasonsByMonth seasonsByMonth = new SeasonsByMonth();
        Seasons actualSeasonsValue = seasonsByMonth.seasonByMonthChecking(input);
        String actualValue =String.valueOf(actualSeasonsValue);
        Assertions.assertEquals(expected, actualValue);
    }

    private static Stream<Arguments> provideMonthsForChooseSeason() {
        return Stream.of(
                Arguments.of("APRIL", "SPRING"),
                Arguments.of("OCTOBER", "AUTUMN"),
                Arguments.of("FEBRUARY", "WINTER"),
                Arguments.of("JUNE", "SUMMER")
        );
    }

}