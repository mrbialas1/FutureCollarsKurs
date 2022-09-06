package com.futurecollars.lesson10.exercise1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String pathToFile = "C:/Users/mrbia/Desktop/FutureCollarsKurs/Bootcamp/src/main/java/com/futurecollars/lesson10/exercise1/data.txt";
        File file = new File(pathToFile);
        String text = "Kurs\n" +
                "Java\n" +
                "Lekcja 6\n" +
                "Pliki\n" +
                "Wyjątki\n" +
                "Pliki\n" +
                "Koniec pliku";

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
