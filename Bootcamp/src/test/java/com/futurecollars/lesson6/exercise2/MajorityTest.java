package com.futurecollars.lesson6.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MajorityTest {
    @Test
    void shouldBeFalse() {
        //given
        int age = 16;
        //when
        boolean child = Majority.isMajor(age);
        //then
        Assertions.assertFalse(child);
    }

    @Test
    void shouldBeTrue() {
        //given
        int age = 30;
        //when
        boolean adult = Majority.isMajor(age);
        //then
        Assertions.assertTrue(adult);
    }

    @Test
    void shouldBeTrueWhenAgeEqual18() {
        //given
        int age = 18;
        //when
        boolean newAdult = Majority.isMajor(age);
        //then
        Assertions.assertTrue(newAdult);
    }
}
