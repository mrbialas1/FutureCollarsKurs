package com.futurecollars.lesson7.exercise2;

public class Movie {
    private final String theme;
    private final String directorName;
    private final int duration;
    private final int yearOfProduction;

    public Movie(String theme, String directorName, int duration, int yearOfProduction) {
        this.theme = theme;
        this.directorName = directorName;
        this.duration = duration;
        this.yearOfProduction = yearOfProduction;
    }
}
