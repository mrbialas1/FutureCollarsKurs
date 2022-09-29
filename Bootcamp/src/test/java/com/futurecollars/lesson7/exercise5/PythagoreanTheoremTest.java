package com.futurecollars.lesson7.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.futurecollars.lesson7.exercise5.PythagoreanTheorem.IsTriangleRectangular;
import static com.futurecollars.lesson7.exercise5.PythagoreanTheorem.getLongestSide;

public class PythagoreanTheoremTest {
    @Test
    void shouldBeTrue() {
        //given
        int side1 = 5;
        int side2 = 3;
        int side3 = 4;
        //when
        boolean rectangular = IsTriangleRectangular(side1, side2, side3);
        //then
        Assertions.assertTrue(rectangular);
    }

    @Test
    void shouldBeFalse() {
        //given
        int side1 = 2;
        int side2 = 4;
        int side3 = 6;
        //when
        boolean rectangular = IsTriangleRectangular(side1, side2, side3);
        //then
        Assertions.assertFalse(rectangular);
    }

    @Test
    void shouldBeInOrder() {
        //given
        int[] table = new int[]{1, 5, 3};
        //when
        int longestSide = getLongestSide(table);
        //then
        Assertions.assertEquals(5, table[longestSide]);
    }
}
