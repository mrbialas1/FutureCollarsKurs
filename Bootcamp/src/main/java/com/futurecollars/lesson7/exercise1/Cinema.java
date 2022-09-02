package com.futurecollars.lesson7.exercise1;
import static com.futurecollars.lesson7.exercise1.Main.stateCheck;

public class Cinema {
    int placeNumber;
    int rowNumber;
    boolean stateOfUse;
     public Cinema(int placeNumber, int rowNumber, boolean stateOfUse){
         this.placeNumber = placeNumber;
         this.rowNumber = rowNumber;
         this.stateOfUse = stateOfUse;
         String state = stateCheck(stateOfUse);
         System.out.println( state +" miejce " + placeNumber + " w rzędzie " + rowNumber);
     }
}
