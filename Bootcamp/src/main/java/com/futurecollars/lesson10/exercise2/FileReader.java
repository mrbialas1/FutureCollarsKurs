package com.futurecollars.lesson10.exercise2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {

    public static void readFile(String path) {
        String content = null;
        try {
            content = Files.readString(Paths.get(path));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println(content);
    }
}
