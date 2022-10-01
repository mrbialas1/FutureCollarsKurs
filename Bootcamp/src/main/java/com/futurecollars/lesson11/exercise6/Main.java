package com.futurecollars.lesson11.exercise6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] tableOfTraining = {{0, 30, 60}, {0, 300, 400}, {0, 160, 175}};
        System.out.println("Wprowadź kolejno trzy wartości z treningu zatwierdzając każdą przyciskiem \"Enter\"");
        enterValueOfParameters(tableOfTraining);
        double result = getResult(tableOfTraining);
        System.out.println(result);
        writeFinalTrainingEffectivity(result);
    }

    private static void writeFinalTrainingEffectivity(double result) {
        String text;
        if (result < 1.2) text = "niska";
        else if (result >= 1.2 && result < 2) text = "dobra";
        else if (result >= 2 && result < 3) text = "bardzo dobra";
        else if (result == 3) text = "doskonała";
        else text = "oszukana";
        System.out.println("Efektywność całego treningu jest " + text);
    }

    private static double getResult(int[][] tableOfTraining) {
        Training training = new Training();
        int[] parameters = training.giveParametersDegree(tableOfTraining);
        return training.weightedAverage(parameters);
    }

    private static void enterValueOfParameters(int[][] tableOfTraining) {
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            tableOfTraining[i][0] = sc.nextInt();
        }
    }
}
