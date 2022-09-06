package com.futurecollars.lesson10.exercise7;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String content = null;
        try {
            content = Files.readString(Paths.get("C:/Users/mrbia/Desktop/FutureCollarsKurs/Bootcamp/src/main" +
                    "/java/com/futurecollars/lesson10/exercise7/data.txt"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        String text = content.toUpperCase();

            System.out.println(text);
        String pathToFile = "C:/Users/mrbia/Desktop/FutureCollarsKurs/Bootcamp/src/main/java/com/futurecollars/" +
                "lesson10/exercise7/output.txt";
        File file = new File(pathToFile);
        writeToFile(pathToFile, text);
    }
    public static void writeToFile(String pathToFile, String text){
        try {
            Files.writeString(Paths.get(pathToFile), text);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
