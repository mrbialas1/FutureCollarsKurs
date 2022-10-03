package com.futurecollars.lesson10.exercise9;

public class Main {
    public static void main(String[] args) {
        String pesel = "12345678900";
        PeselValidator peselValidator = new PeselValidator();
        peselValidator.validatePesel(pesel);
    }
}
