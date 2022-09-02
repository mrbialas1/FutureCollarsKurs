package com.futurecollars.lesson7.exercise1;

public class Main {
    public static void main(String[] args) {
        Cinema place1 =new Cinema(8,13,true);
        Cinema place2 =new Cinema(6,9,false);
    }
    public static String stateCheck(boolean stateOfUse){
        String state;
        if(stateOfUse){
            state = "Wolne";
        }
        else{
            state = "Zajęte";
        }
        return state;
    }
}
