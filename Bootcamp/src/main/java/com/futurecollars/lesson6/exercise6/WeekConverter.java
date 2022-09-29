package com.futurecollars.lesson6.exercise6;

public class WeekConverter {
    public static String convertNumberToWeekDay(int number) {
        String day;
        String[] inWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        int tableNumber = number - 1;
        if (number >= 1 && number <= 5) {
            day = inWeek[tableNumber];
        } else if (number >= 6 && number <= 7) {
            day = "Weekend";
        } else {
            day = "There is no such a day!";
        }
        return day;
    }
}
