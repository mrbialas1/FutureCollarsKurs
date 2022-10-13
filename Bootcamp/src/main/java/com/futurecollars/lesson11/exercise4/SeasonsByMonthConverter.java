package com.futurecollars.lesson11.exercise4;

import java.time.Month;

public class SeasonsByMonthConverter {
    public Seasons seasonByMonthChecking(Month month) {
        switch (month) {
            case JANUARY:
            case FEBRUARY:
            case DECEMBER:
                return Seasons.WINTER;
            case MARCH:
            case APRIL:
            case MAY:
                return Seasons.SPRING;
            case JUNE:
            case JULY:
            case AUGUST:
                return Seasons.SUMMER;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return Seasons.AUTUMN;
            default:
                throw new IllegalArgumentException("Month no exist");
        }
    }
}
