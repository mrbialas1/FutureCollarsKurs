package com.futurecollars.lesson11.exercise6;

public class Training {
    public int[] giveParametersDegree(int[][] table) {
        int[] parameters = new int[3];
        for (int i = 0; i < 3; i++) {
            if (table[i][0] < table[i][1]) parameters[i] = 1;
            else if (table[i][0] > table[i][2]) parameters[i] = 3;
            else parameters[i] = 2;
        }
        return parameters;
    }

    public double weightedAverage(int[] parameters) {
        double result = 0;
        for (int i = 0; i < 3; i++) {
            result += parameters[i];
        }
        return result / 3;
    }

}
