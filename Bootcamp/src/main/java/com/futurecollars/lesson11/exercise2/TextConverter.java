package com.futurecollars.lesson11.exercise2;

public class TextConverter {
    public String textToUpperCases(String text) {
        try {
            return text.toUpperCase();
        }catch (Exception e) {
            e.getStackTrace();
            throw new NullPointerException("Wprowadzona została wartość null");
        }
    }
}
