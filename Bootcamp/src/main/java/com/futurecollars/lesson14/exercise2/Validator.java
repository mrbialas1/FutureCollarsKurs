package com.futurecollars.lesson14.exercise2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public boolean validatePesel(Object pesel) {
        Pattern pattern = Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d");
        Matcher matcher = pattern.matcher(String.valueOf(pesel));
        return matcher.matches();
    }
}
