package com.futurecollars.lesson7.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.futurecollars.lesson7.exercise5.PythagoreanTheorem.checkingTriangleIsRectangular;

public class PythagoreanTheoremTest {
    @Test
    void shouldBeTrue() {
        //given
        int side1  = 3;
        int side2  = 4;
        int side3  = 5;
        //when
        boolean rectangular = checkingTriangleIsRectangular(side1, side2, side3);
        //then
        Assertions.assertTrue(rectangular);
    }
    @Test
    void shouldBeFalse() {
        //given
        int side1  = 2;
        int side2  = 4;
        int side3  = 6;
        //when
        boolean rectangular = checkingTriangleIsRectangular(side1, side2, side3);
        //then
        Assertions.assertFalse(rectangular);
    }
}
