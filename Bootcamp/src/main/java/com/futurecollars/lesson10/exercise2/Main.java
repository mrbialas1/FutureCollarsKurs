package com.futurecollars.lesson10.exercise2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String content = null;
        try {
            content = Files.readString(Paths.get("C:/Users/mrbia/Desktop/FutureCollarsKurs/Bootcamp/src/main" +
                    "/java/com/futurecollars/lesson10/exercise2/data.txt"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println(content);
    }
}
