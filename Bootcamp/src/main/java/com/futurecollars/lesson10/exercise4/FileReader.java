package com.futurecollars.lesson10.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    public static void countFileLetters(String path) {
        String content = "";
        try {
            content = Files.readString(Paths.get(path));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println("Liczba znaków w tekście to: " + content.length());
    }
}
