package com.futurecollars.lesson14.exercise5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public int validatePassword(String password) {
        Pattern pattern1 = Pattern.compile("[A-Z]+");
        Matcher matcher1 = pattern1.matcher(password);
        Pattern pattern2 = Pattern.compile("\\d+");
        Matcher matcher2 = pattern2.matcher(password);
        Pattern pattern3 = Pattern.compile(".{7,}");
        Matcher matcher3 = pattern3.matcher(password);
        Pattern pattern4 = Pattern.compile(".2022.");
        Matcher matcher4 = pattern4.matcher(password);
        return checkPasswordCorrection(matcher1, matcher2, matcher3, matcher4);
    }

    public void writePasswordCorrectionInfo(int passwordInfo) {
        switch (passwordInfo) {
            case 1:
                System.out.println("Poprawnie wpisane hasło");
                break;
            case 2:
                System.out.println("Hasło nie może zawierać aktualnego roku");
                break;
            case 3:
                System.out.println("Hasło musi posiadać conajmniej 7 znaków");
                break;
            case 4:
                System.out.println("Hasło musi zawierać conajmniej jedną cyfrę");
                break;
            case 5:
                System.out.println("Hasło musi zawierać conajmniej jedną wielką literę");
                break;
            default:
                throw new IllegalArgumentException("Błąd programu");
        }
    }

    private static int checkPasswordCorrection(Matcher matcher1, Matcher matcher2, Matcher matcher3, Matcher matcher4) {
        if (matcher1.find()) {
            if (matcher2.find()) {
                if (matcher3.find()) {
                    if (!matcher4.find()) {
                        return 1;
                    } else return 2;
                } else return 3;
            } else return 4;
        } else return 5;
    }
}
