package com.futurecollars.lesson11.exercise6;

public class TrainingService {
    private final CaloriesBurntService caloriesBurntService;
    private final TrainingLengthService trainingLengthService;
    private final AverageHeartRateService averageHeartRateService;

    public TrainingService(CaloriesBurntService caloriesBurntService, TrainingLengthService trainingLengthService, AverageHeartRateService averageHeartRateService) {
        this.caloriesBurntService = caloriesBurntService;
        this.trainingLengthService = trainingLengthService;
        this.averageHeartRateService = averageHeartRateService;
    }

    public TrainingEffectiveness rateTraining(int caloriesBurnt, int trainingLength, int averageHeartRate) {
        double trainingLengthRated = trainingLengthService.rateTrainingLength(trainingLength);
        double caloriesBurntRated = caloriesBurntService.rateCaloriesBurnt(caloriesBurnt);
        double averageHeartRateRated = averageHeartRateService.rateAverageHeartRate(averageHeartRate);
        double result = (trainingLengthRated + caloriesBurntRated * 2 + averageHeartRateRated * 3) / 6;
        return convertToTrainingEffectiveness(result);
    }

    private TrainingEffectiveness convertToTrainingEffectiveness(double grade) {
        if (grade == 3){
            return TrainingEffectiveness.DOSKONALA;
        }else if(grade<3&&grade>2){
            return TrainingEffectiveness.BARDZODOBRA;
        }else if (grade<2&&grade>1.2){
            return  TrainingEffectiveness.DOBRA;
        }else {
            return TrainingEffectiveness.NISKA;
        }
    }
}
