package com.futurecollars.lesson7.exercise1;

public class CinemaSeat {
    private final int placeNumber;
    private final int rowNumber;
    private boolean isFree;

    public void setFree(boolean free) {
        isFree = free;
    }

    public CinemaSeat(int placeNumber, int rowNumber, boolean isFree) {
        this.placeNumber = placeNumber;
        this.rowNumber = rowNumber;
        this.isFree = isFree;
    }

    @Override
    public String toString() {
        String state = stateCheck(isFree);
        return "Miejsce w kinie{" +
                "Numer miejsca =" + placeNumber +
                ", Numer rzędu =" + rowNumber +
                ", Stan =" + state +
                '}';
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
