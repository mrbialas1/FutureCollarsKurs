package com.futurecollars.lesson14.exercise6;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1998, 2, 4);
        DateOfBirth dateOfBirth = new DateOfBirth();
        Period period = dateOfBirth.countYearsOld(date);
        int yearsOld = period.getYears();
        String weekDayOfBirth = String.valueOf(dateOfBirth.findWhichDayOfWeek(date));
        long weekOfBirth = dateOfBirth.findWhichWeekOfYear(date);
        System.out.printf("Person is %s years old, born in %s, %s week of year", yearsOld, weekDayOfBirth, weekOfBirth);
    }
}
