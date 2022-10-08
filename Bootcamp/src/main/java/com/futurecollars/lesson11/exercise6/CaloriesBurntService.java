package com.futurecollars.lesson11.exercise6;

public class CaloriesBurntService {
    public int rateCaloriesBurnt(int caloriesBurnt){
        int grade;
        if (caloriesBurnt > 400){
            grade = 3;
        }else if (caloriesBurnt < 400 && caloriesBurnt >300){
            grade = 2;
        }else {
            grade = 1;
        }
        return grade;
    }
}
