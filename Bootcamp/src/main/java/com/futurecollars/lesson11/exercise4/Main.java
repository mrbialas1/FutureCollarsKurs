package com.futurecollars.lesson11.exercise4;

import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Month month = Month.APRIL;
        writeActualSeason(month);
    }

    private static void writeActualSeason(Month month) {
        SeasonsByMonthConverter seasonsByMonthConverter = new SeasonsByMonthConverter();
        Seasons season = seasonsByMonthConverter.seasonByMonthChecking(month);
        System.out.println("Actual season: " + season);
    }
}
