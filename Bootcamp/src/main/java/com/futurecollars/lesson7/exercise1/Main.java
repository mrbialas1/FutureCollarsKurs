package com.futurecollars.lesson7.exercise1;

public class Main {
    public static void main(String[] args) {
        CinemaSeat place1 = new CinemaSeat(8, 13, true);
        CinemaSeat place2 = new CinemaSeat(6, 9, false);
    }

    public static String stateCheck(boolean stateOfUse) {
        String state;
        if (stateOfUse) {
            state = "Wolne";
        } else {
            state = "Zajęte";
        }
        return state;
    }
}
