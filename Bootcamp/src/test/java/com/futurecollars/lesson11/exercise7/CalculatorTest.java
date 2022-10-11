package com.futurecollars.lesson11.exercise7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;


import java.util.stream.Stream;


class CalculatorTest {
    @ParameterizedTest
    @MethodSource("provideParametersToCountSalary")
    void shouldCountSalary(int basicSalary, int saturdayWorkBonus, double expected) {
        //given
        Calculator calculator = new Calculator(500, 4);
        Calculator calculatorMock = Mockito.mock(Calculator.class);
        Mockito.when(calculatorMock.basicSalary()).thenReturn(basicSalary);
        Mockito.when(calculatorMock.saturdaysWorkBonus()).thenReturn(saturdayWorkBonus);
        //when
        double finalSalary = calculator.calculateFinalSalary(calculator.getBonus(), calculator.getSaturdaysWorked(), calculatorMock.basicSalary(), calculatorMock.saturdaysWorkBonus());
        //then
        Assertions.assertEquals(expected, finalSalary);
    }

    private static Stream<Arguments> provideParametersToCountSalary() {
        return Stream.of(
                Arguments.of(3000, 300, 4700),
                Arguments.of(4000, 700, 7300),
                Arguments.of(3200, 400, 5300)

        );
    }

}