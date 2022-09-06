package com.futurecollars.lesson10.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String content = null;
        try {
            content = Files.readString(Paths.get("C:/Users/mrbia/Desktop/FutureCollarsKurs/Bootcamp/src/main" +
                    "/java/com/futurecollars/lesson10/exercise4/data.txt"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        String[] value = content.split("");
        System.out.println("Liczba znaków w tekście to: " + value.length);
    }
}