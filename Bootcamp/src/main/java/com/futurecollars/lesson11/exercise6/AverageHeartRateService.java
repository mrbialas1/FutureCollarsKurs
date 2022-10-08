package com.futurecollars.lesson11.exercise6;

public class AverageHeartRateService {
    public int rateAverageHeartRate(int caloriesBurnt){
        int grade;
        if (caloriesBurnt > 175){
            grade = 3;
        }else if (caloriesBurnt < 175 && caloriesBurnt >160){
            grade = 2;
        }else {
            grade = 1;
        }
        return grade;
    }
}
