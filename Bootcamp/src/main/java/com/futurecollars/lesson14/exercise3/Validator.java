package com.futurecollars.lesson14.exercise3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public boolean validateUrlLink(String link) {
        Pattern pattern1 = Pattern.compile("^https://");
        Pattern pattern2 = Pattern.compile("^http://");
        Pattern pattern3 = Pattern.compile(".*\\.com");
        Pattern pattern4 = Pattern.compile(".*\\.pl");
        Matcher matcher1 = pattern1.matcher(link);
        Matcher matcher2 = pattern2.matcher(link);
        Matcher matcher3 = pattern3.matcher(link);
        Matcher matcher4 = pattern4.matcher(link);
        if (matcher1.find() || matcher2.find()) {
            return (matcher3.find() || matcher4.find());
        } else {
            return false;
        }
    }
}
