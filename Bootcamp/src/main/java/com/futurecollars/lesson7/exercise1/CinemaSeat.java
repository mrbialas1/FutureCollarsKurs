package com.futurecollars.lesson7.exercise1;

import static com.futurecollars.lesson7.exercise1.Main.stateCheck;

public class CinemaSeat {
    private final int placeNumber;
    private final int rowNumber;
    private boolean isFree;

    public CinemaSeat(int placeNumber, int rowNumber, boolean isFree) {
        this.placeNumber = placeNumber;
        this.rowNumber = rowNumber;
        this.isFree = isFree;
        String state = stateCheck(isFree);
        writeSeatInfo(placeNumber, rowNumber, state);
    }

    private static void writeSeatInfo(int placeNumber, int rowNumber, String state) {
        System.out.println(state + " miejce " + placeNumber + " w rzędzie " + rowNumber);
    }
}
