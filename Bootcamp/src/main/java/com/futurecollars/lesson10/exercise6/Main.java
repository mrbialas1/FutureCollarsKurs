package com.futurecollars.lesson10.exercise6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String content = null;
        try {
            content = Files.readString(Paths.get("C:/Users/mrbia/Desktop/FutureCollarsKurs/Bootcamp/src/main" +
                    "/java/com/futurecollars/lesson10/exercise6/data.txt"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        String[] value = content.split("\n");
        for (int i = value.length-1; i >=0; i--) {
            System.out.println(value[i]);
        }
    }
}
