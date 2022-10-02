package com.futurecollars.lesson14.exercise4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Numbers {
    public String divisionOfNumbersIntoCategories(String number) {
        String numberCategory;
        Pattern pattern1 = Pattern.compile("^\\d+$");
        Matcher matcher1 = pattern1.matcher(number);
        Pattern pattern2 = Pattern.compile("^\\d+\\.\\d+$");
        Matcher matcher2 = pattern2.matcher(number);
        Pattern pattern3 = Pattern.compile("^\\d\\.\\d+e\\+\\d+$");
        Matcher matcher3 = pattern3.matcher(number);
        Pattern pattern4 = Pattern.compile("^\\d\\.\\d+E\\+\\d+$");
        Matcher matcher4 = pattern4.matcher(number);
        Pattern pattern5 = Pattern.compile("^\\d\\.\\d+e-\\d+$");
        Matcher matcher5 = pattern5.matcher(number);
        Pattern pattern6 = Pattern.compile("^\\d\\.\\d+E-\\d+$");
        Matcher matcher6 = pattern6.matcher(number);
        if (matcher1.find()) {
            numberCategory = String.valueOf(NumbersCategories.INTEGERS);
        } else if (matcher2.find()) {
            numberCategory = String.valueOf(NumbersCategories.FLOATING);
        } else if (matcher3.find() || matcher4.find() || matcher5.find() || matcher6.find()) {
            numberCategory = String.valueOf(NumbersCategories.SCIENTIFIC);
        } else {
            throw new IllegalArgumentException("Liczba nie pasuje do żadnej kategorii");
        }
        return numberCategory;
    }
}
