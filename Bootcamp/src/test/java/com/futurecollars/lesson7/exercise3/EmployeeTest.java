package com.futurecollars.lesson7.exercise3;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.futurecollars.lesson7.exercise3.Main.writeInformation;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    @Test
    void shouldBeFree() {
        //given
        int bonus =400;
        Manager manager = new Manager("Jan", "Kowalski", 2008);
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        //when
        writeInformation(manager, bonus);
        //then
        assertEquals("Imię: Jan\n" +
                "Nazwisko: Kowalski\n" +
                "Miesięczna płaca: 5000\n" +
                "Miesięczna płaca z bonusem: 5400\n" +
                "Lata zatrudnienia: 14\r\n",outContent.toString());
    }
}
