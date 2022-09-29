package com.futurecollars.lesson7.exercise1;

import static com.futurecollars.lesson7.exercise1.CinemaSeat.writeSeatInfo;

public class Main {
    public static void main(String[] args) {
        CinemaSeat place1 = new CinemaSeat(8, 13, true);
        CinemaSeat place2 = new CinemaSeat(6, 9, false);
        writeSeatInfo(place1);
        writeSeatInfo(place2);
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
