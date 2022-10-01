package com.futurecollars.lesson11.exercise4;

import java.time.Month;

public class Main {
    public static void main(String[] args) {
        String month = String.valueOf(Month.APRIL);
        writeActualSeason(month);
    }

    private static void writeActualSeason(String month) {
        SeasonsByMonth seasonsByMonth = new SeasonsByMonth();
        Seasons season = seasonsByMonth.seasonByMonthChecking(month);
        System.out.println("Actual season: " + season);
    }
}
