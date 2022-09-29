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
    }

    public static void writeSeatInfo(CinemaSeat place) {
        String state = stateCheck(place.isFree);
        System.out.println(state + " miejce " + place.placeNumber + " w rzędzie " + place.rowNumber);
    }
}
