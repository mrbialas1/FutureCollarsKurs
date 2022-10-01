package com.futurecollars.lesson11.exercise7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;


import java.util.stream.Stream;


class CalculatorTest {
    @ParameterizedTest
    @MethodSource("provideStringsForTrimAndInLowerCase")
    void shouldVerifyStringTrimAndInLowerCase(double basicSalary, double saturdayWorkBonus, double expected) {
        //given
        VariablePayments variablePaymentsMock = Mockito.mock(VariablePayments.class);
        Calculator calculator = new Calculator(500, 4, variablePaymentsMock);
        Mockito.when(variablePaymentsMock.basicSalary()).thenReturn(basicSalary);
        Mockito.when(variablePaymentsMock.saturdayWorkBonus()).thenReturn(saturdayWorkBonus);
        //when
        double finalSalary = calculator.calculateFinalSalary(calculator.getBonus(),calculator.getSaturdaysWorked(),variablePaymentsMock);
        //then
        Assertions.assertEquals(expected, finalSalary);
    }

    private static Stream<Arguments> provideStringsForTrimAndInLowerCase() {
        return Stream.of(
                Arguments.of("3000 ","300 ", "4700"),
                Arguments.of("4000 ","700 ", "7300"),
                Arguments.of("3200 ","400 ", "5300")

        );
    }

}