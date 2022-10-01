package com.futurecollars.lesson11.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import java.util.stream.Stream;

class CurrencyCalculatorTest {
    @ParameterizedTest
    @MethodSource("provideMonthsForChooseSeason")
    void shouldVerifyStringTrimAndInLowerCase(Currency input, double rate, double output) {
        //given
        int amount = 100;
        CurrencyExchangeRate currencyExchangeRateMock = Mockito.mock(CurrencyExchangeRate.class);
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(currencyExchangeRateMock);
        Mockito.when(currencyExchangeRateMock.getBuyRate(input)).thenReturn(rate);
        //when
        double answer = currencyCalculator.calculateExchange(amount, input);
        //then
        Assertions.assertEquals(output, answer);
    }

    private static Stream<Arguments> provideMonthsForChooseSeason() {
        return Stream.of(
                Arguments.of(Currency.EUR, 0.25, 25),
                Arguments.of(Currency.GBP, 0.2, 20),
                Arguments.of(Currency.USD, 0.18, 18)
        );
    }
}