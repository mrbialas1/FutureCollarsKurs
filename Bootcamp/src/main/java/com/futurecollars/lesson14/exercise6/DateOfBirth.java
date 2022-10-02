package com.futurecollars.lesson14.exercise6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateOfBirth {
    public Period countYearsOld(LocalDate dateOfBirth) {
        LocalDate dateNow = LocalDate.now();
        return Period.between(dateOfBirth, dateNow);
    }

    public DayOfWeek findWhichDayOfWeek(LocalDate dateOfBirth) {
        return dateOfBirth.getDayOfWeek();
    }

    public long findWhichWeekOfYear(LocalDate dateOfBirth) {
        int addDay = 0;
        long daysBetween = ChronoUnit.DAYS.between(dateOfBirth.withMonth(1).withDayOfMonth(1), dateOfBirth);
        DayOfWeek endDay = (dateOfBirth.withMonth(1).withDayOfMonth(1).getDayOfWeek());
        int numberOfDay = weekDayToNumber(endDay);
        if (numberOfDay > 3) addDay = 1;
        return (daysBetween - numberOfDay) / 7 + addDay;
    }

    public int weekDayToNumber(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
                return 1;
            case TUESDAY:
                return 2;
            case WEDNESDAY:
                return 3;
            case THURSDAY:
                return 4;
            case FRIDAY:
                return 5;
            case SATURDAY:
                return 6;
            case SUNDAY:
                return 7;
            default:
                throw new IllegalArgumentException("Nie ma takiego dnia tygodnia");
        }
    }
}
