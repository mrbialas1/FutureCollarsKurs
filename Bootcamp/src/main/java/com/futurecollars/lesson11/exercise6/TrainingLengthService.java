package com.futurecollars.lesson11.exercise6;

public class TrainingLengthService {
    public int rateTrainingLength(int caloriesBurnt){
        int grade;
        if (caloriesBurnt > 60){
            grade = 3;
        }else if (caloriesBurnt < 60 && caloriesBurnt >30){
            grade = 2;
        }else {
            grade = 1;
        }
        return grade;
    }
}
