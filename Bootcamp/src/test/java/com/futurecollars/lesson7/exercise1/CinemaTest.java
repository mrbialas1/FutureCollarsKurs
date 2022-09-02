package com.futurecollars.lesson7.exercise1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.futurecollars.lesson7.exercise1.Main.stateCheck;

public class CinemaTest {
    @Test
    void shouldBeFree() {
        //given
        boolean stateOfUse = true;
        //when
        String state = stateCheck(stateOfUse);
        //then
        Assertions.assertEquals("Wolne",state);
    }
    @Test
    void shouldBeBusy() {
        //given
        boolean stateOfUse = false;
        //when
        String state = stateCheck(stateOfUse);
        //then
        Assertions.assertEquals("Zajęte",state);
    }
}
