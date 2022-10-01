package com.futurecollars.lesson8.exercise7;

public class WeekNameConverter {
    public static String getDayOfWeek(int weekDayNumber) {
        String day;
        switch (weekDayNumber) {
            case 1:
                day = String.valueOf(WeekDays.MONDAY);
                break;
            case 2:
                day = String.valueOf(WeekDays.TUESDAY);
                break;
            case 3:
                day = String.valueOf(WeekDays.WEDNESDAY);
                break;
            case 4:
                day = String.valueOf(WeekDays.THURSDAY);
                break;
            case 5:
                day = String.valueOf(WeekDays.FRIDAY);
                break;
            case 6:
                day = String.valueOf(WeekDays.SATURDAY);
                break;
            case 7:
                day = String.valueOf(WeekDays.SUNDAY);
                break;
            default:
                day = "Nie ma dnia tygodnia o takim numerze";
        }
        return day;
    }
}
