package com.futurecollars.lesson14.exercise2;

public class Main {
    public static void main(String[] args) {
        String pesel = "12345678900";
        validatePesel(pesel);
    }

    private static void validatePesel(String pesel) {
        Validator validator = new Validator();
        boolean matches = validator.validatePesel(pesel);
        writePeselTruthInfo(matches);
    }

    private static void writePeselTruthInfo(boolean matches) {
        if (matches) {
            System.out.println("Pesel jest zgodny");
        } else {
            System.out.println("Błędnie wpisany pesel");
        }
    }
}
