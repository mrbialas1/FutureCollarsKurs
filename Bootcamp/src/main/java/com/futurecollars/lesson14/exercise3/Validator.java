package com.futurecollars.lesson14.exercise3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public boolean validateUrlLink(String link) {
        Pattern pattern = Pattern.compile("^https?://.\\.*");
        Matcher matcher = pattern.matcher(link);
        return matcher.find();
    }
}
