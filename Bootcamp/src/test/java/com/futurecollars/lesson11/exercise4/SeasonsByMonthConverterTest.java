package com.futurecollars.lesson11.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.Month;
import java.util.stream.Stream;

class SeasonsByMonthConverterTest {
    @ParameterizedTest
    @MethodSource("provideMonthsForChooseSeason")
    void shouldCheckActualSeason(Month input, Seasons expected) {
        //given
        SeasonsByMonthConverter seasonsByMonthConverter = new SeasonsByMonthConverter();
        //when
        Seasons actualSeasonsValue = seasonsByMonthConverter.seasonByMonthChecking(input);
        //then
        Assertions.assertEquals(expected, actualSeasonsValue);
    }

    private static Stream<Arguments> provideMonthsForChooseSeason() {
        return Stream.of(
                Arguments.of(Month.APRIL, Seasons.SPRING),
                Arguments.of(Month.OCTOBER, Seasons.AUTUMN),
                Arguments.of(Month.FEBRUARY, Seasons.WINTER),
                Arguments.of(Month.JUNE, Seasons.SUMMER)
        );
    }

}