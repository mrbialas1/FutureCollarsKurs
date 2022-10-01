package com.futurecollars.lesson10.exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    public static String readFile(String path) {
        String content = null;
        try {
            content = Files.readString(Paths.get(path));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return content;
    }

    public static void readEverySecondLineOfFile(String content) {
        String[] value = content.split("\n");
        for (int i = 1; i < value.length; i=i+2) {
            System.out.println(value[i]);
        }
    }
}
