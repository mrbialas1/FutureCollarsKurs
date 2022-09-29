package com.futurecollars.lesson8.exercise7;

public class WeekNameConverter {
    public static String writeDayOfWeek(int weekDayNumber) {
        String day;

        switch (weekDayNumber) {
            case 1:
                day = String.valueOf(WeekDays.Monday);
                break;
            case 2:
                day = String.valueOf(WeekDays.Tuesday);
                break;
            case 3:
                day = String.valueOf(WeekDays.Wednesday);
                break;
            case 4:
                day = String.valueOf(WeekDays.Thursday);
                break;
            case 5:
                day = String.valueOf(WeekDays.Friday);
                break;
            case 6:
                day = String.valueOf(WeekDays.Saturday);
                break;
            case 7:
                day = String.valueOf(WeekDays.Sunday);
                break;
            default:
                day = "Nie ma dnia tygodnia o takim numerze";
        }
        return day;
    }
}
