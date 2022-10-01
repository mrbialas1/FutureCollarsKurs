package com.futurecollars.lesson11.exercise1;

public class ProblemSolve {
    public int addEveryDigitOfNumber(int number) {
        String stringNumber = Integer.toString(number);
        int[] everyDigitOfNumber = new int[stringNumber.length()];
        int answer = 0;
        for (int i = 0; i < stringNumber.length(); i++) {
            everyDigitOfNumber[i] = Integer.parseInt(String.valueOf(stringNumber.charAt(i)));
            answer += everyDigitOfNumber[i];
        }
        return answer;
    }

    public boolean isDivisibleOfTwo(int number) {
        return number % 2 == 0;
    }
}
