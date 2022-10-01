package com.futurecollars.lesson10.exercise9;

public class PeselValidator {
    public static void validatePesel(String pesel) {
        try {
            Long.valueOf(pesel);
            if (pesel.length() != 11) {
                throw new IllegalArgumentException("Pesel powinien posiadać jedenaście cyfr");
            }
        } catch (NumberFormatException e) {
            throw new WrongTypeOfDataException("Zły typ danych. Pesel powinien składać się z cyfr");
        }
    }
}
