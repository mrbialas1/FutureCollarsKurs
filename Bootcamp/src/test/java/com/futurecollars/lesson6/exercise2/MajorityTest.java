package com.futurecollars.lesson6.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MajorityTest {
    @Test
    void shouldBeFalse() {
        boolean child = Majority.majorityChecking(16);
        Assertions.assertEquals(false, child);
    }

    @Test
    void shouldBeTrue() {
        boolean adult = Majority.majorityChecking(30);
        Assertions.assertEquals(true, adult);
    }

    @Test
    void shouldBeTrueToo() {
        boolean newAdult = Majority.majorityChecking(18);
        Assertions.assertEquals(true, newAdult);
    }
}
