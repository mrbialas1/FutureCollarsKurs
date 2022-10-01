package com.futurecollars.lesson7.exercise1;

public class Main {
    public static void main(String[] args) {
        CinemaSeat place1 = new CinemaSeat(8, 13, true);
        CinemaSeat place2 = new CinemaSeat(6, 9, true);
        System.out.println(place1.toString());
        place2.setFree(false);
        System.out.println(place2.toString());
    }
}
